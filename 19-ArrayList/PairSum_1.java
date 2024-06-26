import java.util.ArrayList;

public class PairSum_1 {
    //brute force = O(n^2)
    public static boolean printSum(ArrayList<Integer> list,int target){

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == 5){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(printSum(list, target));
    }
}