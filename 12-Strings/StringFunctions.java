public class StringFunctions{
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //String compare function
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2)
        {
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }

        if(s1 == s3)
        {
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }

        //Substring function
        String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str, 0, 5));

    }
}