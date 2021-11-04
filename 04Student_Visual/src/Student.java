
public class Student {
    private String fullName ;

    public Student() {
        fullName = "" ;
    }

    public Student(String as) {
        fullName = as ;
    }

    public String getFullName() {
        return fullName ;
    }
  
    public void setFullName(String f) {   
        fullName = f ;
    }

    public String toString() {
        return "\nAd Soyad: "+ fullName ;
    }
}


