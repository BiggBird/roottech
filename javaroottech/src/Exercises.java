import java.util.Scanner;
public class Exercises {
    public static void main(String args[]) {



//        boolean flag = false;
//        int x = 0;
//        int y = 5;
//        if(flag) {
//            System.out.println("flag is true");
//        } else {
//            System.out.println("flag is false");
//        }
//
//        if (x < y) {
//            System.out.println("x is less than y");
//        } else if (x == y) {
//            System.out.println("x is equal to y");
//        } else if (x > y) {
//            System.out.println("x is greater than y");
//        }



        Scanner input = new Scanner( System.in );
        int check = input.nextInt();
        if (check == 8) {
            System.out.println("user input 8");
        } else if (check == 1) {
            System.out.println("user input 1");
        }else {
            System.out.println("user input is " + check);
        }





    }
}
