package console_numberformat_invoiceapplication;
import java.util.Scanner;
import java.text.NumberFormat; //bu classtan nesne türetirken "new" sözcügünü kullanamayız, bunda getCurrencyInstance(para birimi için) falan kullanırız

public class Console_NumberFormat_InvoiceApplication {

    public static void main(String[] args) {

        final double SALES_TAX_PCT = .05; //vergi degeri oranı

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the results
            double discountPercent = 0.0;
            if (subtotal >= 100)
                discountPercent = .1;
            else
                discountPercent = 0.0;
            
            double discountAmount = subtotal * discountPercent;
            double totalBeforeTax = subtotal - discountAmount;
            double salesTax = totalBeforeTax * SALES_TAX_PCT;
            double total = totalBeforeTax + salesTax;

            // format and display the results
            NumberFormat currency = //NumberFormat.getNumberInstance(); normalde bunu kullanıyoduk bu farklı amacı var ve number formatın 3 farklı yöntemide bu satırlarda duruyor
                NumberFormat.getCurrencyInstance();
            NumberFormat percent =
                NumberFormat.getPercentInstance();
            String message = 
                "Discount percent: "
              + percent.format(discountPercent) + "\n"
              + "Discount amount:  "
              + currency.format(discountAmount) + "\n"
              + "Total before tax: "
              + currency.format(totalBeforeTax) + "\n"
              + "Sales tax:        "
              + currency.format(salesTax) + "\n"
              + "Invoice total:    "
              + currency.format(total) + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }    
}
