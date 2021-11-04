public class ArrayDef_Console {
    static final int DIMENSION = 15;                    
    static int[] integerDizi = new int[DIMENSION];           
    static double[] doubleDizi = { 1.1, 2.2, 3.3, 4.4, 5.5, 
                                   6.6, 7.7, 8.8, 9.9, 10.10}; //dimension 10
    static String[] monthsDizi = { "Ocak", "Subat", "Mart", "Nisan", "Mayis","Haziran", 
                                  "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik" }; //dimension 12
    
    public static void main(String[] args) {
       
    try{    
        System.out.println("Index\t Tams./Int. \t Gercel/Doub. \t  Aylar/Months");       
        for (int k = 0; k < doubleDizi.length; k++)    
            System.out.println(k + " \t\t " + integerDizi[k] + " \t         " + doubleDizi[k] + "\t        " + monthsDizi[k]);
    }
    catch (RuntimeException e){
        System.out.println(e.toString());
    }
    } 
}
