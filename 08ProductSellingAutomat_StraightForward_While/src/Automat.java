
import java.util.Scanner;
public class Automat {

        public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
            int numberOfLira = 0;
            System.out.println("Ürün sayısını giriniz/Enter number of product :");
            int numberOfProduct = Integer.parseInt(oku.next());
            System.out.println("Ürün fiyatını giriniz/Enter price of product :");
            int priceOfProduct = Integer.parseInt(oku.next());

            String cont = "e";
            while (cont.equalsIgnoreCase("E"))
            {
                System.out.println("\nÜrün fiyatı/Product price : " + priceOfProduct + " lira."
                        + "\nSatın almak istediğiniz ürün sayısına göre para atınız./Insert coin in accordance to quantity of prooduct you want to buy");
                int para = Integer.parseInt(oku.next());

                numberOfLira = numberOfLira + para;
                if (numberOfProduct - para / priceOfProduct >=0) {
                    numberOfProduct = numberOfProduct - para / priceOfProduct;
                System.out.println("Satış Bilgileri/Selling Info :");
                System.out.println("Satılan ürün sayısı/Number of sold product :" + numberOfLira/priceOfProduct +
                                "\nMevcut lira sayısı/Current number of lira  :" + numberOfLira); }
                else
                    System.out.println("\nÜrün sayisi yetersiz/Insufficient number of product :");     
                System.out.println("\nDevam edecekseniz e veya E girin/If you'll continue enter e or E :");
                cont = oku.next();
            }
       }
}
