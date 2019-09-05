import java.util.ArrayList;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        ArrayList<String> valid = new ArrayList<>();
        for(String email : emails) {
            String trueEmail = "";
            boolean afterPlus = false;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '+') {
                    afterPlus = true;
                }
                if (!afterPlus && email.charAt(i) != '.' && email.charAt(i) == '@') {
                    trueEmail += email.charAt(i);
                }
                if (email.charAt(i) == '@') {
                    trueEmail += email.substring(i);
                    System.out.println(trueEmail);
                    break;
                }
            }
            if (!valid.contains(trueEmail)) {
                valid.add(trueEmail);
            }
        }
        return valid.size();
    }
}
