public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tony");
        for(char ch = 'a';ch<='z';ch++){
            str.append(ch);
        }
        System.out.println(str);
    }
}
