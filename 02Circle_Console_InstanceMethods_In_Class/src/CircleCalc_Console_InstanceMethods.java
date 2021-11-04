
import java.util.Scanner;
public class CircleCalc_Console_InstanceMethods {

    public static void main(String[] args) {
        
            Scanner giris = new Scanner(System.in);
            double r;

            System.out.print("\nYaricap giriniz/Enter radius : ");
            r = Double.parseDouble(giris.nextLine());
            
            Circle daire = new Circle(r);

            String cikis = "\nYaricap/Radius        : " + r +
                           "\nCevre/Circumference   : " + daire.calcCircum() +
                           "\nAlan/Area             : " + daire.calcArea();

            System.out.println(cikis);
    }
}
