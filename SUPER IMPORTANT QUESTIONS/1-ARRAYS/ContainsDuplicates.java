import java.util.*;

public class ContainsDuplicates {
    public static boolean checkDuplicates(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,6,3,2,1};

        if(checkDuplicates(nums)){
            System.out.println("There is duplicate found.");
        }else{
            System.out.println("There is no duplicates found.");
        }
    }
}
