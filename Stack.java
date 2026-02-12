import java.util.*;
public class stack {
    
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(2);
        st.push(5);
        st.push(7);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       // System.out.println(st.peek());
       // System.out.println(st);
       // st.pop();
       // System.out.println(st);


       //reverse of a stack element using another stack
        Stack<Integer>st1=new Stack<>();
        while (st.size()>0) {
            st1.push(st.pop());
           
        }
         System.out.println(st1);

        //inset an element at random position
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the position where you want to insert a new element:");
        int x= sc.nextInt();

        if(x<0||x>st.size()){
            System.out.println("Invalid position");
            return;
        }

        
        // Move elements until position
        while(st.size() > x){
            st1.push(st.pop());
        }

        System.out.println("enter the element:");
        int z= sc.nextInt();

        st.push(z);

        // Restore elements
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }

        System.out.println("Updated Stack: " + st);

    }
}
