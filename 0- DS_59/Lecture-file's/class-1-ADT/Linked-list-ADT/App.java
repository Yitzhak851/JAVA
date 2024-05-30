public class App {
    public static void main(String[] args){
        Node<Integer> n1 = new Node<Integer>(5);
        System.out.println(""+n1);
        Node<Integer> n2 = new Node<Integer>(4,n1);
        List<Integer> l1 = new List<Integer>(n2);
        System.out.println(""+n2);
    }
}
