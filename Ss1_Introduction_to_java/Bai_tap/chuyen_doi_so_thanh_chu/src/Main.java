import java.util.Scanner;

public class Main {
    static void readTwoNumber(int number) {
        readNumber(number/10);
        System.out.print("ty");
        System.out.print(" ");
        readNumber(number%10);
    }
    static void readNumber(int number) {
        switch (number) {
            case 10:
                System.out.print("Ten");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 1:
                System.out.print("One");
                break;
            case 0:
                System.out.print("Zero");
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 0 && number <= 10) {
            readNumber(number);
        } else if (number < 20) {
            readNumber(number%10);
            System.out.println("teen");
        } else if (number < 30) {
            System.out.print("Twenty ");
            readNumber(number % 10);
        } else if (number >= 20 && number < 100) {
            readTwoNumber(number);
        } else if (number >= 100 && number <= 999) {
            readNumber(number / 10 / 10);
            System.out.print(" hundred and ");
            readTwoNumber(number % 100);
        }
        else {
            System.out.print("You number is very big. We can not translate !!");
        }
    }

}