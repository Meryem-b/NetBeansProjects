public class ArrayDizi {
   private long[] a;                 
   private int n;                    

   public ArrayDizi(int dimension) {
      a = new long[dimension];                 
      n = 0;                             
   }
   public boolean findEleman(long lookedFor)  {                                     
      int j;
      for(j=0; j<n; j++)                 
         if(a[j] == lookedFor) break;                       
      if(j == n)                         
         return false;                   
      else
         return true;                    
   }
   public void addEleman(long value) {
      a[n] = value;              
      n++;                           
   }
   public boolean deleteEleman(long value) {
      int j;
      for(j=0; j<n; j++)             
         if( value == a[j] ) break;
      if(j==n)                       
         return false;
      else  {
         for(int k=j; k<n; k++)      
            a[k] = a[k+1];
         n--;                        
         return true;  }
   }

   public String toString() {
      String sonuc = ("\nDizi boyutu/Array dimension : "+ a.length + ", Kullanilan boyut/Used locations : "+ n + "\n");             
      sonuc+=("Dizi elemanlari/Array elements : ");             
      for(int j=0; j<n; j++)            
         sonuc+=(a[j] + " ");  
      sonuc+="\n";
      return sonuc;
   }
} 
