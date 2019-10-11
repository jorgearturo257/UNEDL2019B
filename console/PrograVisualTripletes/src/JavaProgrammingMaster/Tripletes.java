package JavaProgrammingMaster;
import java.util.Scanner;

public class Tripletes {

    public static void main (String[]args){
        Scanner dt = new Scanner(System.in);
        int a0 = dt.nextInt();
        int a1 = dt.nextInt();
        int a2 = dt.nextInt();
        int b0 = dt.nextInt();
        int b1 = dt.nextInt();
        int b2 = dt.nextInt();

        int a = 0;
        int b = 0;

        if (a0 > b0) a++;
        if (a0 < b0) b++;

        if (a1 > b1) a++;
        if (a1 < b1) b++;

        if (a2 > b2) a++;
        if (a2 < b2) b++;

        System.out.println(a + " " + b);
    }

}
