package Activity3;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args)  {
        int menuOption;
        //int day;
        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("Press 1: To Play");
        System.out.println("Press 2: To Exit");
        menuOption = in.nextInt();

        //while (menuOption != 2) {
        if (menuOption == 1) {
        	System.out.println("Enter numbers 1 - 7 to find out which day it indicates");
        	int day = in.nextInt();
            switch(day) {
                case 1: 
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                	System.out.println("Invalid input");            	
                	}
        	} else if (menuOption == 2) {
        		System.out.println("Nevermind");
        	}
        }
    }
//}
