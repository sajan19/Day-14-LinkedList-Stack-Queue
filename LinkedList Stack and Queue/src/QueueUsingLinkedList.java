// A Linked List Node
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class QueueUsingLinkedList
{
    private static Node rear = null, front = null;

    // Method to add an element to the queue
    public static void enqueue(int element){
        // Create a New Node named newNode
        Node newNode = new Node(element);
        System.out.println(element+" Inserted in Queue");
        //case: queue was empty
        if (front == null){
            // initialize both front and rear
            front = newNode;
            rear = newNode;
        }
        else {
            // update rear
            rear.next = newNode;
            rear = newNode;
        }
    }
    // Method to dequeue the front element
    public static int dequeue(){
        if (front == null){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        Node temp = front;
        System.out.println(temp.data+" Removed from Queue");
//        System.out.printf("Removing %d\n", temp.data);

        front = front.next;
        // if the list becomes empty
        if (front == null) {
            rear = null;
        }
        int element = temp.data;
        return element;
    }
    // Method to return the top element in a queue
    public static int peek()
    {
        if (front != null) {
            return front.data;
        }
        else {
            System.exit(1);
        }
        return -1;
    }
    // Method to check if the queue is empty or not
    public static void isEmpty() {
//        return rear == null && front == null;
        if ((rear == null && front == null)) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }

    public static void main(String[] args){
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        System.out.println("The front element of Queue is: "+peek());
        isEmpty();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        isEmpty();

    }
}