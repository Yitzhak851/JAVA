public class Assignment423 {
    public static double distance(double x1, double y1, double x2, double y2) {
        double res = 0;
        double a= Math.pow((x1-x2), 2);
        double b= Math.pow((y1-y2), 2);
        res= Math.sqrt(a+b);
        return res;
    }
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        System.out.println("The distance is:" +distance(x1, y1, x2, y2));
    }
}


// >> run >> java AssignmentThree 2 3 6 1
// The distance between (2,3) and (6,1) is: 4.47213595499958
