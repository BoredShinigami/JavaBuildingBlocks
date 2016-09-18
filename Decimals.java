import java.math.BigDecimal;
public class Decimals
{
   public static void main(String[] args)
   {
       System.out.println("DECIMAL SEGMENT");  
       
       double item = 0.70;
       double rate = 0.05;
       double tax = item*rate;
       double total = item+tax;
       
       java.text.NumberFormat cf = java.text.NumberFormat.getCurrencyInstance();
       
       System.out.println("\nItem :\t" + cf.format(item));
       System.out.println("Tax :\t" + cf.format(tax));
       System.out.println("Item :\t" + cf.format(total));
       
       System.out.println("########################");  
       System.out.println("BIGINTEGER SEGMENT");  
       
       BigDecimal item2 = new BigDecimal(0.70);
       BigDecimal rate2 = new BigDecimal(0.05);
       BigDecimal tax2 = item2.multiply(rate2);
       BigDecimal total2 = item2.add(tax2);
       
       java.text.NumberFormat xf = java.text.NumberFormat.getCurrencyInstance();
       
       System.out.println("\nItem :\t" + xf.format(item2));
       System.out.println("Tax :\t" + xf.format(tax2));
       System.out.println("Item :\t" + xf.format(total2));
       
       System.out.println("\nItem :\t" + item2);
       System.out.println("Tax :\t" + tax2);
       System.out.println("Item :\t" + total2);  
   }
}
