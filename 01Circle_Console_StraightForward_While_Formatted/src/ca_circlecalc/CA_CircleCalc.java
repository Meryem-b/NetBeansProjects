package ca_circlecalc;
import java.util.Scanner;

public class CA_CircleCalc {

    public static void main(String[] args) {
        Scanner giris = new Scanner( System.in );
        double r; 
        String optn = "Y";
        while (optn.equalsIgnoreCase("y")) {
            
            System.out.print( "\nEnter radius : " ); 
            r = giris.nextDouble();

            System.out.println();  // Blank line

            double alan = Math.PI * r * r;
            double cevre = 2 * Math.PI * r;
            System.out.printf( "Area            : %f %n", alan );
            System.out.printf( "Circumference   : %f %n", cevre );
            
            System.out.println("Continue (Y or y) ? : ");
            optn = giris.next();
       } //while end
    } // main end
} // class end
