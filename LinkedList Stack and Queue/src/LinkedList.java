//Create a simple LinkedList
public class LinkedList {
    //class Node
    class Node{
        //instance Variables
        int data;
        Node next;
        //Constructor
        public Node(int data) {
            this.data = data;
        }
    }
    //Node Variables
    Node head;
    Node tail;
    int size = 0;
    //Method to Add Node
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
//        System.out.println(this);
    }
    //String to String Method
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        Node curr = head;
        while(curr != null){
            buf.append(curr.data).append(",");
            curr = curr.next;
        }
        if(buf.length()>1){
            buf.deleteCharAt(buf.length()-1);
        }
        buf.append("]");
        return buf.toString();
    }
    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList");
        //Create Linked List
        LinkedList list = new LinkedList();
        System.out.println("Simple LinkedList: ");
        //Added Elements to LinkedList
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);
    }
}