/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab05-2
 */

package futurevalueconsole;
    
    import java.text.NumberFormat;
    import java.util.Scanner;

public class FutureValueConsole {
    
        private static Scanner sc = new Scanner( System.in );
        
    public static void main(String[] args) {
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        
       System.out.print("\nAylık Ödeme Miktarınızı Giriniz: ");
       
       double aylıkodeme=sc.nextDouble();
       
       System.out.print("\n");
       
       double oran[]={5.0,5.5,6.0,6.5,7.0};
      
       System.out.print("\t  "+"%5,0"+"\t\t  "+"%5,5"+"\t\t  "+"%6,0"+"\t\t  "+"%6,5"+"\t\t  "+"%7,0"+"\t");
       
       for(int i=1;i<=5;i++){
           
           System.out.print("\n"+i+". Yıl \t");
           
           for(int k=0;k<=4;k++){
           
               double fv=fonk(aylıkodeme,oran[k],i);
           
               String message=currency.format(fv)+"\t";
           
               System.out.print(message);
               
           }
      
       }
        
        System.out.println("\n");
        
    }
    
    
    private static double fonk(double aylıkodeme,double yıllıkfaiz, int yıl){
       
        final int MONTHS_IN_YEAR = 12;
        int months = yıl * MONTHS_IN_YEAR;
        double monthlyInterestRate = yıllıkfaiz/MONTHS_IN_YEAR/100;
        double futureValue = 0;
        
        for (int i = 1; i <= months; i++){

            futureValue = (futureValue + aylıkodeme)*(1 + monthlyInterestRate);

        }
        
        return futureValue;
    
    }
        
}