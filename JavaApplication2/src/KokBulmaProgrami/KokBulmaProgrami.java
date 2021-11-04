/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab02-1
 */
package KokBulmaProgrami;

    import java.util.Scanner;

public class KokBulmaProgrami {

    
    public static void main(String[] args) {
           
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ikinci derece denklemler için reel kok bulma programina hosgeldiniz !!!");
        
        double a,b,c;
        double diskriminant;
        double kok1,kok2,cakisikkok;
        String kontrol="Y";
        
        while(kontrol.equalsIgnoreCase("y")){
        
        System.out.print("--------------------------------------------------------------------------\n");
            
        System.out.print("\nLutfen x^2 li terimin katsayisini giriniz: ");
        
        a=sc.nextDouble();
        
        System.out.print("\nLutfen x li terimin katsayisini giriniz: ");
        
        b=sc.nextDouble();
        
        System.out.print("\nLutfen sabit degeri giriniz: ");
        
        c=sc.nextDouble();
        
        diskriminant=((Math.pow(b,2))-(4*a*c));
        
        System.out.print("\nDiskriminant= "+diskriminant+"\n");
        
        if(diskriminant<0){
            
            System.out.print("\nDiskriminantimiz goruldugu uzere negatif cikti fakat biz reel kok bulmak istiyoruz.\nBu yuzden diskriminant negatif olamaz !!!");
        
        }
        
        else{
            
            if(diskriminant==0){
                
                cakisikkok=-(b/(2*a));
                
                System.out.print("\nTek bir reel kokumuz vardır = "+cakisikkok);
                
            }
            
            else{
                
                kok1=(-b-(Math.sqrt(diskriminant)))/(2*a);
                kok2=(-b+(Math.sqrt(diskriminant)))/(2*a);
                
                System.out.print("\nİki adet reel kokumuz vardir;"+"\n"+"x1= "+kok1+"\n"+"x2= "+kok2);
                     
            }           
        }  
        
        System.out.print("\n\nPROGRAMA DEVAM ETMEK ISTIYORMUSUNUZ ? (EVET:Y veya HAYIR:herhangi bir tus) = ");
        
        kontrol=sc.next();
        
        }
       
        System.out.println();
        
    }    
}
