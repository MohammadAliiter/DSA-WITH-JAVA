public class createlinkedlist {
    public static void displayrecursive(Node head){
        if(head==null)
        return;
        System.out.print(head.data + " ");
        displayrecursive(head.Next);
    }
    public static int length(Node head){
        int counter = 0;
        while(head!= null){
            counter++;
            head=head.Next;
        }
        return counter;

    }
    public static void displayrevers(Node head){
        if(head==null) return;
       displayrevers(head.Next);
       System.out.print(head.data + " ");

    }
    public static void display(Node head) {
           while(head!=null){
            System.out.print(head.data + " ");
            head=head.Next;
           }
    }
    public static class Node{
        int data;
        Node Next;
       Node(int val){
        this.data=val;
       }
    }
 public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(3);
    Node c = new Node(9);
    Node d = new Node(7);
    Node e = new Node(8);
    Node f = new Node(15);
    a.Next = b;
    b.Next = c;
    c.Next = d;
    d.Next = e;
    e.Next = f;
    /* Node temp = a;
     for(int i=0;i<6;i++){
        System.out.print(temp.data + " ");
        temp=temp.Next;
     }
     
    Node temp = a;
     while(temp!=null){
        System.out.print(temp.data + " ");
        temp=temp.Next;
     }
     */
      display(a);
      System.out.println();
      displayrecursive(a);
      System.out.println();
      displayrevers(a);
      System.out.println("length is");
      System.out.println(length(a));
    }
}
