import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Give me the first number!");
        int firstNumber = In.readInt();
        Out.println("Give me the second number!");
        int secondNumber = In.readInt();
        Out.println("Give me the third number!");
        int thirdNumber = In.readInt();

        int max = firstNumber;

        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }

        Out.println("Biggest number" + max);
    }
}
