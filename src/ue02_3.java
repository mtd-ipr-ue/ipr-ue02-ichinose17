import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Give me the coordinates of the points to check if it is inside the green area ");
        Out.print("x coordinate: ");
        double x = In.readDouble();
        Out.print("y coordinate: ");
        double y = In.readDouble();

        if (x >= 0 && x <= 4){
            if (y >= 0 && y <= 4 ){
                double d = Math.sqrt(x*x + y*y);
                if (d >= 4 ){
                    Out.print("It's inside of the green area");
                }else{
                    Out.println("It's outside of the green area");
                }
            } 
            else{
                Out.println("It's outside of the green area");
            }
        }else{
            Out.println("It's outside of the green area");
        }
    }

}
