public class Heap {
    int data;
    int Node left;
    int Node right;
    
    class Node{
        int data;
        Node next;
        public Node(){
            this.data = 0;
            this.next = null;
        }
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    
    
    
}
