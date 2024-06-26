import java.util.ArrayList;

public class PrintSum_PointerApproach {
    
    //2 pointer approach
    public static boolean printSum(ArrayList<Integer> list,int target){

        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            
            if(list.get(lp) + list.get(rp) == target){//case1
                return true;
            }
            
            if(list.get(lp) + list.get(rp) < target ){//case 2
                lp++;
            }
            else{//case 3
                rp--;
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
