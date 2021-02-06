
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    static int max(int a, int b) {
        //résultat : le plus grand de a et b
        if (a > b) {
            return a;
        } else /* a=<b */ {
            return b;
        }
    }

    static int maxDeTroisNombreV1(int a, int b, int c) {
        return max(max(a, b), max(b, c));
    }

    // bad implmentation
    static int maxDeTroisNombreV2(int a, int b, int c) {
        if (a >= b && b > c) {
            return a;
        } else if (b >= a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {


        int nb1 = 6;
        int nb2 = 2;
        int nb3 = 3;


        System.out.println("hellocommit avec GIT en logat dans TPgit2");
        System.out.println("travail dans le nouveau répertoire");
        System.out.println("nb1=" + nb1);
        System.out.println("nb2=" + nb2);
        System.out.println("nb3=" + nb3);
        System.out.println("Max=" + maxDeTroisNombreV1(nb1, nb2, nb3) + " " + maxDeTroisNombreV2(nb1, nb2, nb3));

    }
}