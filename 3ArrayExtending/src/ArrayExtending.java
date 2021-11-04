public class ArrayExtending {
   private long[] a;                 
   private int n,k;                    

   public ArrayExtending(int boyut) {
      a = new long[boyut];                 
      n = 0;  
   }
   public void addEleman(long deger) {
      a[n] = deger;                  
      n++;
      if (n >= a.length ) {
      long[] gecici = new long[a.length * 2];

      for (int i = 0; i < a.length ; i++)
         gecici[i] = a[i];
      a = gecici; }            
   }
   public String toString() {
      String sonuc = "\nDizi boyutu/Array dimension : "+ a.length + ", Kullanilan boyut/Used number : "+ n + "\n";             
      sonuc+="Dizi elemanlari/Array Elements : ";             
      for(int j=0; j<n; j++)            
         sonuc+=(a[j] + " ");  
      sonuc+="\n";
      return sonuc;
   }
} 
