package Easy;

public class MaskingPersonalInformation {
    public String maskPII(String S) {
        if (S.contains("@")) {
            String target = "";
            S = S.toLowerCase();
            for (int i = 0; i < S.length(); i++) {
                if (i == 0) {
                    target += S.charAt(i);
                } else if (S.charAt(i) == '@') {
                    target += "*****";
                    target += S.charAt(i - 1) + S.substring(i);
                }
            }
            return target;
        } else {
            String target = "";
            String pureNum = "";
            int countNum = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) >= 48 && S.charAt(i) <= 57) {
                    countNum++;
                    pureNum += S.charAt(i);
                }
            }
            if (countNum > 10) {
                target += "+";
                for (int i = 0; i < countNum - 10; i++) {
                    target += "*";
                }
                target += "-***-***-" + pureNum.substring(countNum - 10 + 6);

            } else {
                target += "***-***-" + pureNum.substring(6);
            }
            return target;
        }
    }

    public static void main(String[] args) {
        MaskingPersonalInformation a = new MaskingPersonalInformation();
        System.out.println(a.maskPII("LeetCode@LeetCode.com"));
    }
}
