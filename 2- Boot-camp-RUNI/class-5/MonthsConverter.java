public class MonthsConverter {

  public static String convertMonth (int a) {
    String[] arrayMon = new String[12];
    arrayMon = [Januar, Februar, March, April, May, Juny, July, August, September, October, Nov, Decem];
    if (a==1){
      System.out.println(" "+ arrayMon[0]);
      return arrayMon;
    } else if (a==2){
      System.out.println(" "+ arrayMon[0]);
      return arrayMon;

    }else if (a==3){

    }else if (a==4){
      
    }else if (a==5){

    }else if (a==6){

    }else if (a==7){

    }else if (a==8){

    }else if (a==9){

    }else if (a==10){

    }else if (a==11){

    }
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

  }
}

/**
 * Converts a number from 1 to 12 into its proper month name.
 * For example, 3 converts to March.
 */
