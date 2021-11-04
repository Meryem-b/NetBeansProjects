package ca_circlecalc;
import java.util.Scanner;

public class CA_CircleCalc {
    static double r; // class variable

    public static void main(String[] args) {
        Scanner giris = new Scanner( System.in );
        String optn = "Y";
        while (optn.equalsIgnoreCase("y")) {
            System.out.print( "\nEnter radius : " );
            String sr = giris.nextLine() ;
            r = Double.parseDouble(sr);

            hesaplaYaz();
            
            System.out.println("Continue (Y or y) ? : ");
            optn = giris.nextLine();
        } //while end
    } // main end
    
    public static void hesaplaYaz(){
        double alan = Math.PI * r * r;  //local variable
        double cevre = 2*Math.PI*r;     //local variable
        System.out.format( "Area          : %-15.2f %n", alan );
        System.out.format( "Circumference : %-15.2f %n", cevre );
    } // method end
    
} // class end
