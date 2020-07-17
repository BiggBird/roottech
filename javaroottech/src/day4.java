import java.util.Scanner;

public class day4 {
    public static void main(String args[]) {
        // practice example 1

        int a = 4;
        int b = 4;
        int c = 7;
        boolean tree = true;

        boolean x = true;
        boolean y = false;

        if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        }

        if (a != c && tree == true) {
            System.out.println("The numbers are not equal and the boolean is true");
        }

        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }

        boolean hi = !( !x && y);
        System.out.println(hi);

        if (hi || y) {
            boolean hello = true;
            System.out.println(hello);
        } else {
            boolean hello = false;
            System.out.println(hello);
        }

        // practice example 2

        for (int count = 1; count < 11; count ++) {
            System.out.println(count);
        }

        int conditionNumb = 1;
        while (conditionNumb != 0) {
            Scanner userInput = new Scanner( System.in );
            int number = userInput.nextInt();
            conditionNumb = number;
        }

    }
}
