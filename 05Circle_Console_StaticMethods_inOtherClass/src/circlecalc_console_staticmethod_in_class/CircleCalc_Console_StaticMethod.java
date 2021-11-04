package circlecalc_console_staticmethod_in_class;
import java.util.Scanner;

public class CircleCalc_Console_StaticMethod {

    public static void main(String[] args) {
        
            Scanner giris = new Scanner(System.in);
            double r;

            System.out.print("\nYaricap giriniz : ");
            r = Double.parseDouble(giris.nextLine());
            
            String cikis = "\nYaricap : " + r +
                           "\nCevre   : " + Daire.cevreBul(r) +
                           "\nAlan    : " + Daire.alanBul(r);

            System.out.println(cikis);
    }
}
