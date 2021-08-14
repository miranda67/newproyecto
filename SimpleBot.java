package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Lenin", "2021"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }

    static void test() {

        System.out.println("Let's test your programming knowledge.");
        System.out.println("With what combination of characters is a tab stop?");
        System.out.println("1. / and n");
        System.out.println("2. / and t");
        System.out.println("3. / and f");
        System.out.println("4. / and l");

    }

    static void end() {

        int opc1 = scanner.nextInt();

        if (opc1 != 2) {
            System.out.println("Sorry, try again.");
            int opc2 = scanner.nextInt();
            if (opc2 != 2) {
                System.out.println("Sorry, try again.");
                int opc3 = scanner.nextInt();
                if (opc1 != 3) {
                    System.out.println("Sorry, try again.");
                    int opc4 = scanner.nextInt();
                }
            }
        }

        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
