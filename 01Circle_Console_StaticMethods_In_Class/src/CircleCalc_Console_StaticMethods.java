
import java.util.Scanner;
public class CircleCalc_Console_StaticMethods {

    public static void main(String[] args) {
        
            Scanner giris = new Scanner(System.in);
            double r;

            System.out.print("\nYaricap giriniz/Enter radius : ");
            r = Double.parseDouble(giris.nextLine());
            
            String cikis = "\nYaricap/Radius        : " + r +
                           "\nCevre/Circumference   : " + Circle.calcCircum(r) +
                           "\nAlan/Area             : " + Circle.CalcArea(r);

            System.out.println(cikis);
    }
}
