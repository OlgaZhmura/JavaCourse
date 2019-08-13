import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args){
       // int x;
       // int y = 28;
        int z = 4, n = 10;
        int res;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
       // x = 26;

        res = (x + (50- y * z) / n) - x;
        System.out.println("Res = " + res);

        int l = "dflkjlks".length();

        System.out.println("length = " + l);
        System.out.printf("%d != %d", l, res);
        System.out.print("\nno new row\n");

        System.out.println(Math.sqrt(64));
    }
}
