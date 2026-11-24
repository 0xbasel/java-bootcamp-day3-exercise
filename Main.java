import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Write a program that checks the role of the user
        System.out.print("Please enter your role: ");
        String role = in.nextLine();

        if (role.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("welcome user");
        } else {
            System.out.println("Invalid role");
        }

        // 2. Take three numbers from the user and print the greatest number
        System.out.print("Please enter the first number: ");
        int firstNum = in.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNum = in.nextInt();

        System.out.print("Please enter the third number: ");
        int thirdNum = in.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println(firstNum + " the first number is the greatest");
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println(secondNum + " the second number is the greatest");
        } else {
            System.out.println(thirdNum + " the third number is the greatest");
        }

        // 3. Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.print("Please enter a day number (from 1 to 7): ");
        int dayNum = in.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        /*
        4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grade scale:
         A: 90-100
         B: 80-89
         C: 70-79
         D: 60-69
         F: 0-59
         */
        System.out.print("Enter your numeric score: ");
        int numericScore = in.nextInt();

        if (numericScore < 0 || numericScore > 100) {
            System.out.println("Invalid score please input a number between 0 and 100");
        } else if (numericScore >= 90) {
            System.out.println("Letter Grade: A");
        } else if (numericScore >= 80) {
            System.out.println("Letter Grade: B");
        } else if (numericScore >= 70) {
            System.out.println("Letter Grade: C");
        } else if (numericScore >= 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }

        // 5. Write a Java program that takes person's age as input and categorizes them into one of three age categories: "Child, Teenager or Adult" using an if statement.
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else {
            System.out.println("You are an Adult.");
        }
    }
}
