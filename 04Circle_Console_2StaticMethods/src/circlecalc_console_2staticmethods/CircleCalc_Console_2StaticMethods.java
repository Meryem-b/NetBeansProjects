package circlecalc_console_2staticmethods;
import java.util.Scanner;
public class CircleCalc_Console_2StaticMethods {

    public static void main(String[] args) {
        
            Scanner giris = new Scanner(System.in);
            double r;

            System.out.print("\nYaricap giriniz : ");
            r = Double.parseDouble(giris.nextLine());
            
            String cikis = "\nYaricap : " + r +
                           "\nCevre   : " + cevreBul(r) +
                           "\nAlan    : " + alanBul(r);

            System.out.println(cikis);
    }
    public static double alanBul(double r) {
            return Math.PI * r * r;
    }
    public static double cevreBul(double r) {
            return 2 * Math.PI * r;
    }
}
