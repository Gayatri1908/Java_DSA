public class doubleLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static class InnerdoubleLinkedlist {
    Node head=null;
    Node tail=null;

    public void InsertionAtHead(int data){
           Node temp= new Node(data);
           if(head==null){
            head=temp;
            tail=temp;
           }
           else{
            temp.next=head;
            head.prev=temp;
            head=temp;
           }
           System.out.println(head.data);
        }

        public void insertionAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                temp.prev=tail;
                tail=temp;
            }
            System.out.println(tail.data);
        }

    public void InsertionAtAnyPosition(int data,int pos){
            Node newnode=new Node(data);
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            temp.next.prev=newnode;
            temp.next = newnode;
            System.out.println("inserted"+data+"at position"+pos);
        }

    public void deletion(){
        if(head==null){
            System.out.println("list is empty");
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        
    }
    public void DltAtanyPos(int pos){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(pos==0){
            deletion();
            return;
        }
        Node temp=head;
       for(int i=0;i<pos;i++){
        temp=temp.next;
        if(temp == null) {
                System.out.println("Position out of bounds.");
                return;
            }
        }

        temp.prev.next = temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        else {
            tail = temp.prev;
        }
         System.out.println("Deleted node at position " + pos);
         
       }
    

//display
void display(){
    Node temp=head;
    while (temp!=null) {
        System.out.println(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
} 
    
}


public static void main(String[] args) {
    InnerdoubleLinkedlist l1=new InnerdoubleLinkedlist();
    l1.InsertionAtHead(2);
    l1.insertionAtEnd(3);
    l1.insertionAtEnd(4);
    l1.insertionAtEnd(5);
    l1.insertionAtEnd(6);
   System.out.println("Before insertion:");
    l1.display();
    
   l1.InsertionAtAnyPosition(23,2);
   System.out.println("After insertion:");
   l1.display();

   System.out.println("After deletion at begining:");
   l1.display();

     l1. DltAtanyPos(2);
     System.out.println("After deletion at position 2:");
    l1.display(); 


}
}
