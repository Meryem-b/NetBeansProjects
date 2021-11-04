/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab08-1
 */   

public class Address {
    private String street ;
    private String no ;
    private String district ;
    private String county ;
    private String province ;

     public Address() {
    }
    public Address(String st, String n, String dis, String cou, String pro) {
        this.street = st;
        this.no = n;
        this.district = dis;
        this.county = cou;
        this.province = pro;
    }
    
    public String getStreet() {
        return street;
    } 

    public void setStreet(String st) {
        this.street = st;
    }

    public String getNumber() {
        return no;
    }

    public void setNumber(String n) {
        this.no = n;
    }

    public String getDis() {
        return district;
    }

    public void setDis(String dis) {
        this.district = dis;
    }

    public String getCou() {
        return county;
    }

    public void setCou(String cou) {
        this.county = cou;
    }

    public String getPro() {
        return province;
    }

    public void setPro(String pro) {
        this.province = pro;
    }
    public String toString() {
    return "\nSokak/Street    : " + street+
           "\nNo/No           : " + no+
           "\nMahalleDistrict : " + district+
           "\nIlce/County     : " + county+
           "\nIl/Province     : " + province+
           "\n----------------------------------"; 
           
    }
}


