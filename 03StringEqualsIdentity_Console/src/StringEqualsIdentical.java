
public class StringEqualsIdentical {
    
    public static void main(String[] args) {
    String s1 = new String("hello");  
    String s2 = new String("hello");  // s1 and s2 are equal, not identical
    String s3 = new String("Hello");  // s1 and s3 are not equal, not identical
    String s4 = s1;                   // s1 and s4 are equal and identical
    String s5 = "hello";              // s1 and s5 are equal, not identical
    String s6 = "hello";              // s5 and s6 are equal and identical
    /*
      * s1 ve s2 nin identical olmamasının sebebi adreslerinin farklı olması
      * String s4=s1; satırının manası s1'in adresini s4'e ata dedik bu durumda s1 ve s4 ün adresleri aynı oldu hemde içerikleri aynı oldu bu yüzden hem equal hem identical oldular.
      * s5 ve s6 nın hem equal hem identical oolmasının sebebi 'new' sözcüğü ile string almamızdan dolayıdır çünkü 
            -s5 ve s6 aynı adresi gösteriyor buda şöyle oluyor biz önce s5 i tanımlarken hello stringini bir adrese atıyor 
            -sonra biz s6 yı tanımlarken içeriğine bakıyor aynı hello stringi oldugu için buna yeniden bir adres olusturmayıp direk s5 in adresine yolluyor
            -yani optimizasyon yapıyor kendi kendine. Bu işlemi s1 ve s2 de yapmamasının sebebi onları new kullanarak tanımlamamızdandır.
    
    */
        if (s1.equals(s2))
            System.out.println(s1 + " s1 equals s2 " + s2);
        else
            System.out.println(s1 + " s1 does not equal s2 " + s2);
 
        if (s1.equals(s3))
            System.out.println(s1 + " s1 equals s3 " + s3);
        else
            System.out.println(s1 + " s1 does not equal s3 " + s3);
  
        if (s1.equals(s4))
            System.out.println(s1 + " s1 equals s4 " + s4);
        else
            System.out.println(s1 + " s1 does not equal s4 " + s4);

        if (s1.equals(s5))
            System.out.println(s1 + " s1 equals s5 " + s5);
        else
            System.out.println(s1 + " s1 does not equal s5 " + s5);

        if (s5.equals(s6))
            System.out.println(s5 + " s5 equals s6 " + s6);
        else
            System.out.println(s5 + " s5 does not equal s6 " + s6 + "\n");
        
        System.out.println("--------------------------");
        
        if (s1 == s2)
            System.out.println(s1 + " s1 is identical to s2 " + s2);
        else
            System.out.println(s1 + " s1 is not identical to s2 " + s2);
              
        if (s1 == s3)
            System.out.println(s1 + " s1 is identical to s3 " + s3);
        else
            System.out.println(s1 + " s1 is not identical to s3 " + s3);
              
        if (s1 == s4)
            System.out.println(s1 + " s1 is identical to s4 " + s4);
        else
            System.out.println(s1 + " s1 is not identical to s4 " + s4);
              
        if (s1 == s5)
            System.out.println(s1 + " s1 is identical to s5 " + s5);
        else
            System.out.println(s1 + " s1 is not identical to s5 " + s5);
              
        if (s5 == s6)   {
            System.out.println(s5 + " s5 is identical to s6 " + s6); }
        else {
            System.out.println(s5 + " s5 is not identical to s6 " + s6);   }
              
    }
}
