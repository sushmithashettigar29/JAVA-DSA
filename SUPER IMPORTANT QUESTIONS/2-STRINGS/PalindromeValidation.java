

public class PalindromeValidation {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s = "race a car";
        // String s = " ";
        System.out.println(isPalindrome(s));
    }
}
