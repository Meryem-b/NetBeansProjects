package console_distance_pointobject;

import java.awt.Point;
import java.util.Scanner;

public class Console_Distance_PointObject {
 
    public static void main(String[] args) {
        
      Point p1 = new Point();  
      Point p2 = new Point();
      
      Scanner giris = new Scanner (System.in);
      
      System.out.print ("Enter x1 and y1 values separated by blank : ");
      p1.x = Integer.parseInt(giris.next());
      p1.y = Integer.parseInt(giris.next());
      /* 
        *Farkettiysek x ve y yi biz tanımlamadık fakat Point clasının içinde bizim kullanımımız için tanımlanmıs 
            -değişkenlerdir ve bu classta bir pointin 2 değişken alabilme hakkı vardır(p1.x/p1.y) 3. yü alamaz !!!
      */
      System.out.print ("Enter x2 and y2 values separated by blank : ");
      p2.x = Integer.parseInt(giris.next());
      p2.y = Integer.parseInt(giris.next());

      double dis1 = Math.sqrt( Math.pow((p2.x-p1.x),2) + Math.pow((p2.y-p1.y),2) );
      double dis2 = p1.distance(p2.getX(),p2.getY()); //getX ve getY yi p2 nin x ve y koordinatını almak için kullanıyoruz
      
      System.out.println(); 
      System.out.println ("Distance is = " + dis1);
      System.out.println ("Distance is = " + dis2);
    }
    
}
