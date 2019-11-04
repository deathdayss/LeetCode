package Medium;

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
        String result = "";
        for(int i = num1.length() - 1; i >= 0 ; i--) {
            for (int n = num2.length() - 1; n >= 0 ; n++) {
                //Character.getNumericValue(num1.charAt())
            }
        }
        return "";
    }
    public String reverseString (String target) {
        char[] instead = target.toCharArray();
        for (int i = 0; i < instead.length/2; i++) {
            char m = instead[i];
            instead[i] = instead[instead.length - 1 - i];
            instead[instead.length - 1 - i] = m;
        }
        return String.valueOf(instead);
    }
    public String addString (String num1, String num2) {
        String r1 = reverseString(num1);
        String r2 = reverseString(num2);
        int maxLength = Math.max(r1.length(), r2.length());
        char[] result = new char[maxLength];
        int carryIt = 0;
        for (int i = 0; i < maxLength; i++) {
            int getIt = carryIt;
            if (i < r1.length()) {
                getIt += Character.getNumericValue(r1.charAt(i));
            }
            if (i < r2.length()) {
                getIt += Character.getNumericValue(r2.charAt(i));
            }
            String addTwo = Integer.toString(getIt);
            if (addTwo.length() > 1) {
                carryIt = 1;
                result[i] = addTwo.charAt(1);
            } else {
                carryIt = 0;
                result[i] = addTwo.charAt(0);
            }
        }
        if (carryIt > 1) {
            result[maxLength] = 1;
            char[] addOne = new char[maxLength + 1];
            for (int k = 0; k < maxLength; k++) {
                addOne[k] = result[k];
            }
            addOne[maxLength] = '1';
            return String.valueOf(addOne);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Multiply_Strings a = new Multiply_Strings();
        System.out.println(a.addString("12", "21"));
    }
}
