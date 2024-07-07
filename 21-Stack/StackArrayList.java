import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty static keyword is there but removed bcz vs code shows error
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push static keyword is there but removed bcz vs code shows error
        public void push(int data){
            list.add(data);
        }

        //pop static keyword is there but removed bcz vs code shows error
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek  static keyword is there but removed bcz vs code shows error
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}