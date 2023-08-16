/*
 * Draws a rectangle made of '*' of a given dimensions
 * 
 * NOTE: We assume positive width and height
 */

public class DrawRectangle {
    public static void main(String[] args) {
        // TODO- get from the user by args[0]-width
        // TODO-get from the user by args[1]-height
        //TODO- if num ar'not pos - print give pos num
        // TODO- calc the "*" that print-width
        // TODO-calc the "*" that print-height

        int x = Integer.parseInt(args[0]); //height
        int y = Integer.parseInt(args[1]); //width
        
        if(((x<= 0) || (y<= 0))){
            System.out.println("Give positive num");
        }else{
            for (int i = 1; i <= y; i++) {
                for (int j = 1; j <= x; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
