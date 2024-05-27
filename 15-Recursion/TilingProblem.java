public class TilingProblem {
    public static int tiling(int n){// 2 X n (floor size)
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fnm1 = tiling(n-1);

        //horizontal choice
        int fnm2 = tiling(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
