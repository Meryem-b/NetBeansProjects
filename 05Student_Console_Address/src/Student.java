
public class Student {
    
    private String stuNo;
    private String stuFullName ;
    private Address stuAddress; // = new Address();
    
    public Student(String no, String as, Address adrs) {
        stuNo=no  ; stuFullName = as ; stuAddress = adrs;
    }
      
    public String getStuNo() {
        return stuNo;
    }
    public void setStuNo(String no) {
        stuNo = no;
    }

    public String getFName() {
        return stuFullName;
    }

    public void setFName(String as) {
        stuFullName = as;
    }

    public String toString() {
        return "\nOgrenci/Student No : "+ stuNo +
               "\nAd Soyad/Full Name : "+ stuFullName+
                  stuAddress.toString();
    }
}


