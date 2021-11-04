

import java.util.*; 
import java.text.*;
public class BankAccountUsage   {
  public static void main( String[] args)    {

    double cekilen;

    BankAccount musteri1 = new BankAccount ( 0., -100.);
    BankAccount musteri2 = new BankAccount ( );

    //NumberFormat fmt =NumberFormat.getCurrencyInstance(); 
    // new Locale(language, country)
    //NumberFormat fmt =NumberFormat.getCurrencyInstance(new Locale("eng", "US") );
    NumberFormat fmt =NumberFormat.getCurrencyInstance(new Locale("tr", "TR") );
        
    System.out.println( "\nCustomer1's balance   = " +
                        musteri1.getBalance () );
    System.out.println( "Customer1's lower limit = " +
                        musteri1.get_LowerLimit () );
    
    musteri1.money_Deposit (100.00);
    System.out.println( "\nCustomer1 deposited money" );
    System.out.println( "Customer1's balance   = " +
                        musteri1.getBalance () );

    cekilen = 120;
    if (musteri1. money_Withdrawal (cekilen)) {
        System.out.println( "Customer1 withdrew money  --> " + cekilen );
        System.out.println( "Customer1's balance   = " +
                            musteri1.getBalance () );}
    else
        System.out.println( "Customer1 coulnd not withdraw money  --> " + cekilen );
        
    System.out.println( "\nCustomer2's balance  = " +
                        musteri2.getBalance () );
    musteri2.money_Deposit (50);
    System.out.println( "Customer2 deposited money " );
    System.out.println( "Customer2's balance  = " +
                         fmt.format(musteri2.getBalance ()) );
  }
}
