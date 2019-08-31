import java.util.ArrayList;

public class FindWordsThatCanBeFormedbyCharacters { // not finished
        public int countCharacters(String[] words, String chars) {
            int m = 0;
            ArrayList<Character> charit = new ArrayList<>();
            for(char j : chars.toCharArray()) {
                charit.add(j);
            }
            ArrayList<Character> removeIt = new ArrayList<>();
            for (String target : words) {
                System.out.println("first is " + charit);
                boolean t = true;
                for(char it : target.toCharArray()) {
                    if (!charit.remove(Character.valueOf(it))) {
                        t = false;
                        break;
                    } else {
                        System.out.println(removeIt);
                        removeIt.add(Character.valueOf(it));
                    }
                }
                if (t) {
                    m += target.length();
                    removeIt.clear();
                    if (charit.size() == 0) {
                        break;
                    }
                } else {
                    charit.addAll(removeIt);
                    System.out.println("Second is " + charit);
                    removeIt.clear();
                }
            }
            return m;
        }

    /*public static void main(String[] args) {
        FindWordsThatCanBeFormedbyCharacters a = new FindWordsThatCanBeFormedbyCharacters();
        a.countCharacters(new String[] {"hello","world","leetcode"}, "welldonehoneyr");
    } */
}
