public class Assignment422 {
    public static int same(int x, int y) {
        int res=0;
        if(x==y){
            System.out.println("X equal Y; Please Double Up!");
            return res;
        }else if (y>x){
            System.out.println("Y is bigger- you need to double-up again!");
            return res;
        } else{
            res = Math.max(x, y);
            System.out.println("X is bigger, X result is: "+ res );
            System.out.println("Y is smaller, Y result is: "+ y );
            return res;
        }
    }
    public static void main(String[] args) {
        int X = (int)(Math.random()*7);
        int Y = (int)(Math.random()*7);
        same(X, Y);
    }
}