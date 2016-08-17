public class LinkedList{
    public Node head;
    Node tail;
    class Node{
        public int data;
        public Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void addElement(int data){
        Node temp = new Node(data, null);
        tail.next = temp;
        tail = temp;
    }
    
    public static void main(String[] args){
        LinkedList x = new LinkedList();
        int[] y = {1,2,3,4,5};
        for(int i = 0; i < y.size(); i++){
            x.addElement(y[i]);
        }
    }
}
