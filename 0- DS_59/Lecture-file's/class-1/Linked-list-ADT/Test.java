public class Test {
    int size;
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        public Node() {
            data = 0;
            next = null;
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

    public Test(){
        size = 0;
        head = null;
        tail = null;
    }
    public Test(int size){
        this.size = size;
    }
    public addNode(Node element){
        if(size == 0){
            this.head = element;
            this.tail = element;
            size++;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            
        }
    }

    public static void main(String[] args) {
        Test list1 = new Test();
        Test list2 = new Test(4);
    }
}
