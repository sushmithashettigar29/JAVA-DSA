public class FindSubsets {
    
    public static void findSusbSets(String str,String ans,int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choice
        findSusbSets(str, ans+str.charAt(i), i+1);
        //no choice
        findSusbSets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSusbSets(str, "", 0);
    }
}
