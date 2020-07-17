import java.util.ArrayList;

public class ArrayExample {

    // practice 1
    static ArrayList<Integer> x = new ArrayList<>();
    static ArrayList<Integer> challenge = new ArrayList<>();

    //practice 2
    static String[] fruit = {"apple", "banana", "cherry", "kiwi", "orange"};
    static String bigboy = "";

    public static void main(String args[]) {

        // practice 1
        for (int i = 0; i < 10; i ++) {
            x.add(i, i + 1);
        }
        for( Integer y : x){
            System.out.println(y);
        }

        System.out.println();

        // challenge
        int random = (int )(Math.random() * 10 + 1);
        for (int a = 0; a < 10; a++) {
            if (challenge.indexOf(random) == -1) {
                challenge.add(a, random);
                random = (int )(Math.random() * 10 + 1);
            } else {
                random = (int )(Math.random() * 10 + 1);
                a --;
            }
        }

        for( Integer z : challenge){
            System.out.println(z);
        }

        System.out.println();
        // practice 2

        for (int c = 0; c < 5; c ++){
            bigboy += fruit[c];
        }
        System.out.println(bigboy);


    }
}
