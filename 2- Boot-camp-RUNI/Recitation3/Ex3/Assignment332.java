public class Assignment332 {
public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            if(current < n && current > 0 ){
                System.out.println(current);
            }
            int temp = current;
            current += previous;
            previous = temp; 
        }
    }
}

