public class Course {

private String courseCode ;
    private String courseTitle ;
    
    public Course() {
        courseCode="";
        courseTitle = "" ;
    }

    public Course(String kod, String ad) {
        setCourseCode(kod);
        setCourseTitle(ad) ;       
    }

    public String getCourseCode() {
        return courseCode ;
    }
  
    public void setCourseCode(String kod) {   
        courseCode = kod ;
    }

    public String getCourseTitle() {
        return courseTitle ;
    }
  
    public void setCourseTitle(String ad) {   
        courseTitle = ad ;
    }

    public String toString() {
        return "\nDersin kodu/Course Code  : "+ courseCode+
               "\nDersin adi/Course Title  : "+ courseTitle ;
    }    
    
}
