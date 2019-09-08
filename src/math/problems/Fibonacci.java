package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < 39; i++) {
            System.out.println(a + "   ");
            c = a + b;
            a = b;
            b = c;
        }
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


    }
}
