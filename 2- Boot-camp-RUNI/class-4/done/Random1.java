package done;
public class Random1 {
    public static void main(String[] args) {
        // define the range
        int range = 2;
        int rand = (int) (Math.random() * range);  // 0||1   >> 0||2
        System.out.println(rand);
    }
}
