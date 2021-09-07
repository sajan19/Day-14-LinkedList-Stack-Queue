//Create a LinkedList
public class LinkedList {
    class Node{
        //instance Variables
        int data;
        Node next;
        //Constructor
        public Node(int data) {
            this.data = data;
        }
    }
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
        System.out.println(this);
    }
    //Mehtod to insert Node between two Nodes
    public void insertElement(int index, int data){
        if (index<0 || index>(size-1)){
            System.out.println("Index out of Range");
            return;
        }
        Node curr = head;
        Node prev = null;
        int i = 0;
        while(curr != null && i != index){
            prev = curr;
            curr = curr.next;
            i++;
        }
        Node newNode = new Node(data);
        if(prev == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            prev.next = newNode;
            newNode.next = curr;
        }
        size++;
        System.out.println(this);
    }
    //Calling String to String Method
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
    //Main Method
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList");
        //Create a LinkedList Object
        LinkedList list = new LinkedList();
        System.out.println("Simple LinkedList: ");
        //Add elements to LinkedList
        list.add(56);
//        list.add(30);
        list.add(70);
        //Insert element between Two Nodes
        list.insertElement(1,30);
//        System.out.println(list);
    }
}