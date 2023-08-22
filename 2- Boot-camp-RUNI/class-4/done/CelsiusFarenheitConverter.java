package done;
class CelsiusFarenheitConverter {
  public static double convertCelsiusToFarenheit(double c) {
    double f;
    f = (double)(c*(9.0/5.0))+32.0;
    return f;
  }
  public static double convertFarenheitToCelsius(double f) {
    double c;
    c = (f-32.0)*(5.0/9.0);
    return c;
  }
  public static void printMenu(double c, double f) {
    c= convertFarenheitToCelsius(c);
    f= convertCelsiusToFarenheit(f);
    System.out.println(" "+ c +", "+ f + ".");
  }
  public static void main (String[] args) {
    double x  = 20;    //Celsius   -->68.00
    double y = 68;     //Farenheit -->20.00
    printMenu(y, x);
  }
}

/*
* Converts between Celsius and Farenheit temperature
* Celsius -> Farenheit conversion
* Reminder: (C  x  9/5) + 32 = F
* Farenheit -> Celsius conversion
* Reminder: (F  -  32)  x  5/9 = C
* Prints options menu
*/ 