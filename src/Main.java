import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerTwo = new Scanner(System.in);

        System.out.println("Please choose two numbers");

        String userInputOne = scanner.nextLine();
        String userInputTwo = scanner.nextLine();


        double operandOne = Double.parseDouble(userInputOne);
        double operandTwo = Double.parseDouble(userInputTwo);


//        if (userInputOne == "" && userInputTwo == "") {
//            System.out.println("Please choose two numbers");
//            operandOne = Double.parseDouble(userInputOne);
//            operandTwo = Double.parseDouble(userInputTwo);
//            userInputOne = scanner.nextLine();
//        }
//        else (userInputOne != "" && userInputTwo == ""){
//            System.out.println("Choose one more number");
//            userInputTwo = scanner.nextLine();
//        }


        double sum = operandOne + operandTwo;
        double difference = operandOne - operandTwo;
        double multiplication = operandOne * operandTwo;
        double division = operandOne / operandTwo;
        double remainder = operandOne % operandTwo;

        showResults(sum, difference, division, multiplication, remainder);

    }


    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The multiplied values equal " + multiplication);
        System.out.println("The divided values equal " + division + " with a remainder of " + remainder);
    }
}
