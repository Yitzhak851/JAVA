public class Assignment412 {
    public static String morning(String name, int hourOfDay) {
        String str = "Good morning! ";
        return str;
    }
    public static String afternoon(String name, int hourOfDay) {
        String str = "Good afternoon! ";
        return str;
    }
    public static String evening(String name, int hourOfDay) {
        String str = "Good evening! ";
        return str;
    }
    public static String night(String name, int hourOfDay) {
        String str = "Good night! ";
        return str;
    }
    public static void main(String[] args) {
        String str = args[0];                  //getting YBO
        int n = Integer.parseInt(args[1]);     //getting 18 (e.g., 18 means 18:00)
        if (n >= 6 || n <= 11) {
            System.out.println(morning(str, n) + str);
        } else if (n >= 12 || n <= 16) {
            System.out.println(afternoon(str, n)+ str );
        } else if (n >= 17 || n <= 20) {
            System.out.println(evening(str, n)+ str );
        } else if (n >= 21 || n <= 5) {
            System.out.println(night(str, n)+ str );
        } else if(n>=24 || n<=0){
            System.out.println("There is no such time, "+ str + "!");
        }
    }
}
