
public class RandomNumbersMath_Switch_For  {
   public static void main (String[] args) {
       
      int rastgele, sayi1=0, sayi2=0,sayi3=0, sayi4=0,sayi5=0,sayi6=0;
      
      for (int i=1;i<1000001;i++) {
         // math.random() [0,0.999999) bu şekilde sayı üretir
         rastgele = (int)(Math.random()*6) + 1;//[0,5.94)+1=[1,6.94) bu aralıkta üretilebilecek integer lar 1,2,3,4,5,6 dır
         
         switch (rastgele) {
             case 1: sayi1+=1; break;
             case 2: sayi2+=1; break;
             case 3: sayi3+=1; break;
             case 4: sayi4+=1; break;
             case 5: sayi5+=1; break;
             case 6: sayi6+=1; break; } 
      }

      System.out.println ("\n1 sayisi/number : " + sayi1 +
                          "\n2 sayisi/number : " + sayi2 +
                          "\n3 sayisi/number : " + sayi3 +
                          "\n4 sayisi/number : " + sayi4 +
                          "\n5 sayisi/number : " + sayi5 +
                          "\n6 sayisi/number : " + sayi6);
   }
}
