public class MonthsConverter {
  public static String convertMonth (int a) {
    String[] arrayMon = {"Jan", "Feb", "March", "April", "May", "Juny", "July", "Aug", "Sept", "Octo", "Nov", "Decem"};
    String str = arrayMon[a-1];
    return str;
  }
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    if(n>12 || n<1){
      System.out.println("Please insert number between 1-12! ");
    }else{
      System.out.println(" "+ convertMonth(n));
    }
  }
}

/**
 * Converts a number from 1 to 12 into its proper month name.
 * For example, 3 converts to March.
 */
