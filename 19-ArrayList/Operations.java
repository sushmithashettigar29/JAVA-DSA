import java.util.ArrayList;

public class Operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Element operation  = O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);   // O(n)

        System.out.println(list);
        
        //Get elements operations = O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove element operation = O(n)
        list.remove(2);
        System.out.println(list);

        //Set Element at Index = O(n)
        list.set(2, 10);
        System.out.println(list);


        //Contains Element = O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        System.out.println(list.contains(10));


        //size of arraylist
        System.out.println(list.size()); 

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}