

public class Circle {
    
    private double r; //burası İNSTANCE(örnek) VARİABLE

    public Circle(double r) {
        
        this.r = r; // this kullanmamızın amacı class wide olan r'yi(yeşil olan) değişken olarak alınan r ile bir tutmak için yazılır
    
    }   // burası CONSTRUCTOR
    
    public double calcArea()
        {
            return Math.PI * r * r;
        }
    public double calcCircum()
    {
        return 2 * Math.PI * r;
    }
}
