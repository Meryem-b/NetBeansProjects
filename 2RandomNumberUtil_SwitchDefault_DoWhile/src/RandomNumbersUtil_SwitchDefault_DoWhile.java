import java.util.Random;

public class RandomNumbersUtil_SwitchDefault_DoWhile  {
   public static void main (String[] args) {
      int sayi1=0, sayi2=0,sayi3=0, sayi4=0,sayi5=0,sayi6=0;
      int i=1;
      Random uretici = new Random();
      do {    
         switch (uretici.nextInt(6)+1 ) {     //nextInt'in buradaki görevi [0, n-1] arasında tamsayı türetmek tir
             case 1:  sayi1+=1; break;
             case 2:  sayi2+=1; break;
             case 3:  sayi3+=1; break;
             case 4:  sayi4+=1; break;
             case 5:  sayi5+=1; break;
             default: sayi6+=1; break; 
         }
         i++; } 
      while (i<10001);
      String cikti = "\n1 sayisi/number : " + sayi1 +
                     "\n2 sayisi/number : " + sayi2 +
                     "\n3 sayisi/number : " + sayi3 +
                     "\n4 sayisi/number : " + sayi4 +
                     "\n5 sayisi/number : " + sayi5 +
                     "\n6 sayisi/number : " + sayi6 ;
      
      System.out.println (cikti);
   }
}
