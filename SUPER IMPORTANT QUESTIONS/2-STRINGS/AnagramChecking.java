import java.util.*;

public class AnagramChecking {
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() == t.length()){
            char scharArray[] = s.toCharArray();
            char tcharArray[] = t.toCharArray();

            Arrays.sort(scharArray);
            Arrays.sort(tcharArray);

            if(Arrays.equals(scharArray,tcharArray)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "program";
        String t = "rograpm";
        System.out.println(isAnagram(s,t));
    }
}
