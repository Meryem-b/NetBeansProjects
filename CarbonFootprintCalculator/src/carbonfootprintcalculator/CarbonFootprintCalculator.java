/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab02-2
 */

/*             
    Hocamız karbon ayak izi hesaplamasında bizden, su tüketimini de dahil
    etmemizi istemiş fakat internetten araştırdığım kadarıyla ve baktığım
    karbon ayak izi hesaplama uygulamalarının hepsinde su tüketimi
    kullanıcıdan  istenilmemiş. Bundan dolayı ben de programımı su tüketimini
    dahil etmeden yazdım.
           
        Bilginize.
*/  

package carbonfootprintcalculator;

    import java.util.Scanner;

public class CarbonFootprintCalculator {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        
        double elektrik,dogalgaz,ayakizi;
        double etk=0.0005423;                //elektrik tüketim katsayisi
        double dgtk=0.00018533;              //dogalgaz tüketim katsayisi
        int kisi;
        String kontrol="y";
        
        System.out.print("KARBON AYAK İZİ ÖLÇÜM PROGRAMINA HOŞGELDİNİZ");
        System.out.print("\n");
        
        while(kontrol.equalsIgnoreCase("y")){
        
        System.out.print("*******************************************************************************************************\n");    
            
        System.out.print("\nLutfen \"tüketilen enerji miktarlarini(kwh)\" aylik tüketiminizi baz alarak giriniz !");
        
        System.out.print("\n\nHarcanan Elektrik Miktari(kwh)= ");
        elektrik=sc.nextDouble();
        
        if(elektrik<0){
          
            System.out.print("\n\t\t\tTÜKETİM MİKTARI NEGATİF OLAMAZ LÜTFEN TEKRAR DENEYİN !!!\n\n");
            continue;
        }
        
        System.out.print("Harcanan Dogalgaz Miktari(kwh)= ");
        dogalgaz=sc.nextDouble();
        
        if(dogalgaz<0){
          
            System.out.print("\n\t\t\tTÜKETİM MİKTARI NEGATİF OLAMAZ LÜTFEN TEKRAR DENEYİN!!!\n\n");
            continue;
        }
        
        System.out.print("\nEvinizde yasayan kisi sayisi= ");
        kisi=sc.nextInt();
        
        if(kisi<=0){
          
            System.out.print("\n\t\t\tKİŞİ SAYISI İÇİN GİRDİĞİNİZ DEĞER YANLIŞ LÜTFEN TEKRAR DENEYİN!!!\n\n");
            continue;
        }
        
        ayakizi=((elektrik*etk)+(dogalgaz*dgtk))/kisi;
        
        System.out.printf("\nKarbon ayak iziniz= %.6f ton CO2 ",ayakizi);
        
        System.out.print("\n\nDevam etmek için 'Y' , programi bitirmek için herhangi bir tusa basiniz: ");
        kontrol=sc.next();
      
        System.out.println();
        
        }
        
        System.out.println();
       
    }
}