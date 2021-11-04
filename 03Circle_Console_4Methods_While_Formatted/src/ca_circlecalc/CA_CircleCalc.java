package ca_circlecalc;
import java.util.Scanner;

public class CA_CircleCalc {

    private static double r, alan, cevre ;
    private static Scanner giris = new Scanner( System.in );
    
    public static void main(String[] args) {
        
        String optn = "Y";
        while (optn.equalsIgnoreCase("y")) {

            oku();       // same as CA_CircleCalc.oku();
            hesapla();   // same as CA_CircleCalc.hesapla();
            yaz();       // same as CA_CircleCalc.yaz();
            
            System.out.println("Continue (Y or y) ? : ");
            optn = giris.next();
       }
    } // main end
    
    public static void oku() {        
        System.out.print( "\nEnter radius : " ); 
        r = giris.nextDouble();
    }    
    public static void hesapla(){
        alan = Math.PI * r * r;    // never write double alan = ...
        cevre = 2 * Math.PI * r;   // never write double cevre = ...
    }
    public static void yaz(){
        System.out.format( "Area          : %-15.2f %n", alan );
        System.out.format( "Circumference : %-15.2f %n", cevre );
    }
} // class end
