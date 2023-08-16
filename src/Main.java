import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucgenin a kenarini giriniz :");
        a = input.nextDouble();
        System.out.print("Ucgenin b kenarini giriniz ");
        b = input.nextDouble();
        System.out.print("Ucgenin c kenarini giriniz :");
        c = input.nextDouble();
        double u = (a+b+c)/2;
        double cevre = 2 * u;
        double alanKareli = u*(u-a)*(u-b)*(u-c);
        double alan = Math.sqrt(alanKareli);
        System.out.println("Ucgenin alani : " + alan); 

    }
}
