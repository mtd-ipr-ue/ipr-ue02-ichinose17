import java.util.Scanner;

import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Solve the task!");

        Out.print("Enter a year: ");
        int year = In.readInt();

        Out.print("Enter a month (1-12): ");
        int month = In.readInt();

        if (month < 1 || month > 12) {
            Out.println("Error: Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        int days;
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                days = 31;
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11:
                days = 30;
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            default:
            Out.println("Error: Invalid month.");
                return;
        }

        Out.println("The number of days in month " + month + " of the year " + year + " is: " + days);
    }
}

