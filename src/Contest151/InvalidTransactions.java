package Contest151;

import java.util.ArrayList;
import java.util.List;

public class InvalidTransactions {
    public List<String> invalidTransactions(String[] transactions) {
        ArrayList<String> name = new ArrayList();
        ArrayList<Integer> time = new ArrayList();
        ArrayList<String> city = new ArrayList();
        ArrayList<String> invalid = new ArrayList<>();
        for (String trans : transactions) {
            int m = 0;
            int comma = 0;
            String name0 = "";
            int time0 = 0;
            String city0 = "";
            boolean isvalid = true;
            for (int i = 0; i < trans.length(); i++) {
                if (trans.charAt(i) == ',') {
                    if (comma == 0) {
                        name0 = trans.substring(m, i);
                    } else if (comma == 1) {
                        time0 = Integer.parseInt(trans.substring(m, i));
                    } else {
                        if (Integer.parseInt(trans.substring(m, i)) > 1000) {
                            isvalid = false;
                            invalid.add(trans);
                        }
                        city0 = trans.substring(i + 1, trans.length());
                        break;
                    }
                    m = i + 1;
                    comma++;
                }
            }
                for (int i = 0; i < name.size(); i++) {
                    if (name.get(i).equals(name0)) {
                        if(!city.get(i).equals(city0) && Math.abs(time.get(i) - time0) <= 60) {
                            if (isvalid) {
                                isvalid = false;
                                invalid.add(trans);
                            }
                            System.out.println(i);
                            if(!invalid.contains(transactions[i])) {
                                System.out.println(i);
                                invalid.add(transactions[i]);
                            }
                        }
                    }
                }
            name.add(name0);
            time.add(time0);
            city.add(city0);
        }
        return invalid;
    }

    public static void main(String[] args) {
        InvalidTransactions a = new InvalidTransactions();
        a.invalidTransactions(new String[] {"alex,387,885,bangkok","alex,355,1029,barcelona","alex,587,402,bangkok","chalicefy,973,830,barcelona","alex,932,86,bangkok"});
    }
}
