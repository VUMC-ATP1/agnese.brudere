package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1.uzdevums
        int x = 9;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5 && x < 10));
        System.out.println(x == 0 || x == 10);
        System.out.println(x * x > 10);

        // 2.uzdevums
        System.out.println("Wellcome to the calendar!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a month number");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: System.out.println(number + " is not valid.");
        }

        // 3. uzdevums
        System.out.println("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int number3 = scanner.nextInt();
        System.out.println("Max number is: " + Math.max(Math.max(number1, number2), number3));

        // 4. uzdevums
        System.out.println("Enter the color of traffic lights: ");
        String color = scanner.nextLine();

        if (color.equals("Red")) {
            System.out.println("Don't walk");
        } else if (color.equals("Yellow")) {
            System.out.println("Attention");
        } else if (color.equals("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Traffic light is not working");
        }

        // 5. uzdevums
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // 6. uzdevums
        printBusinessCardTwo("Dāvids", "Berzins", "+371 29111119", 2014);
        printBusinessCardTwo("Marks", "Kalnins", "+371 29876789", 2017);

        // 7. uzdevums
        int summa = sum(10, 20);
        System.out.println(summa);

        // 8. uzdevums
        System.out.println(average(55, 79, 24));
    }
        // 6. uzdevums
    private static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("###########");
        System.out.printf("Name: %s\n", name);
        System.out.printf("Surname: %s\n", surname);
        System.out.printf("Phone number: %s\n", telephone);
        System.out.printf("Year of birth: %d\n", dateOfBirth);
        System.out.println("#############");
    }
        // 5. uzdevums
    private static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("###########");
        System.out.println("Name: Agnese");
        System.out.println("Surname: Brudere");
        System.out.println("Phone number: +371 29898989");
        System.out.println("Year of birth: 1987");
        System.out.println("############");
    }

        // 7. uzdevums
    public static int sum(int one, int two) {
        return one + two;
    }

        // 8. uzdevums
    public static double average(double x, double y, double z) {
        return (x + y + z)/3;
    }
}
