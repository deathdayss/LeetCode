import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCount {
    public void helper(String mayBe, int myCount, ArrayList<String> domains, ArrayList<Integer> count) {
        int index = domains.indexOf(mayBe);
        if (index >= 0) {
            int original = count.get(index);
            count.remove(index);
            count.add(index, original + myCount);
        } else {
            domains.add(mayBe);
            count.add(myCount);
        }
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        ArrayList<String> domains = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String target : cpdomains) {
            int myCount = 0;
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) == ' ') {
                    myCount = Integer.parseInt(target.substring(0, i));
                    helper(target.substring(i + 1), myCount, domains, count);
                } else if (target.charAt(i) == '.') {
                    helper(target.substring(i + 1), myCount, domains, count);
                }
            }
        }
        for (int i = 0; i < domains.size(); i++) {
            result.add(count.get(i) + " " + domains.get(i));
        }
        return result;
    }
}
