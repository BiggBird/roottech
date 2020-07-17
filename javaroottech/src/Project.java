import java.util.ArrayList;
import java.util.Scanner;


public class Project {

    ArrayList<Integer> winnumbers = new ArrayList<>();
    ArrayList<Integer> chosennumbers = new ArrayList<>();
    ArrayList<Integer> correctnumbers = new ArrayList<>();
    ArrayList<Integer> wrongnumbers = new ArrayList<>();

    int money = 10;
    int betmoney = 1;
    int winmoney = 5;


    int maxmoney = 100;

    int maxtotalnumb = 80;
    int maxwinnumb = 20;

    public Project() {

        start();

    }

    public void start() {
        winnumbers.clear();
        chosennumbers.clear();
        correctnumbers.clear();
        wrongnumbers.clear();

        int random = (int )(Math.random() * maxtotalnumb + 1);
        for (int a = 0; a < maxwinnumb; a++) {
            if (winnumbers.indexOf(random) == -1) {
                winnumbers.add(a, random);
                random = (int )(Math.random() * maxtotalnumb + 1);
            } else {
                random = (int )(Math.random() * maxtotalnumb + 1);
                a --;
            }
        }



        System.out.println("In this game, you can choose a number between 1 and " + maxtotalnumb + ". Only " + maxwinnumb +
                " are correct. \nYou have $" + money + ".");

        betchoice();
    }

    public void betchoice() {
        System.out.println("Do you want to make a bet? Type 1 for yes and 0 for results.");

        Scanner choice = new Scanner( System.in );
        int userchoice = choice.nextInt();
        if (userchoice == 1) {
            if (money > 0) {
                money = money - betmoney;
                System.out.println("You have $" + money + "\nWhat number do you want to bet on?");
                game();
            } else {
                System.out.println("You do not have enough to make a bet.\n" + "You have $" + money + ".");
                results();
            }
        } else {
            System.out.println("Here are the results: ");
            results();
        }

    }

    public void game() {
        Scanner number = new Scanner( System.in );
        int usernumb = number.nextInt();
        if (chosennumbers.contains(usernumb) == false) {
            chosennumbers.add(usernumb);
            if (winnumbers.contains(usernumb) == true) {
                correctnumbers.add(usernumb);
            } else {
                wrongnumbers.add(usernumb);
            }
        } else {
            System.out.println("You have already typed that number");
            money = money + betmoney;
        }

        betchoice();


    }

    public void results() {
        System.out.println("You got these numbers correct: ");
        for( Integer z : correctnumbers){
            System.out.println(z);
        }
        money = correctnumbers.size() * winmoney + money;

        System.out.println("You got these numbers wrong: ");
        for( Integer z : wrongnumbers){
            System.out.println(z);
        }

        System.out.println("You have $" + money + ".");

        check();

    }

    public void check() {
        if (money <= 0) {
            System.out.println("You lose!");
        } else if (money >= maxmoney) {
            System.out.println("You win!");
        } else if (money > 0 && money < maxmoney) {
            start();
        }
    }


}
