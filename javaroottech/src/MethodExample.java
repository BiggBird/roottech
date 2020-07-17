public class MethodExample {
    public static void main(String args[]) {
        printnumber(10, 0);
    }


    public static void printnumber(int base, int exponent) {

        System.out.println(exponents(base, exponent));
    }

    public static int exponents(int base, int exponent){

        if (exponent == 0) {
            return 1;
        }

        return base * exponents(base, exponent - 1);
    }

}
