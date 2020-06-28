package Entity;

// this entity class is pushed on behalf of Ana due to technical difficulties.
public class Course {

   private String courseNum;
   private String courseName;

   private Course (Builder builder){
       this.courseNum = courseNum;
       this.courseName = courseName;
   }

    @Override
    public String toString() {
        return "Course{" +
                "courseNum='" + courseNum + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public String getCourseNum() {
        return courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public static class Builder{
       private String courseNum;
       private String courseName;

       public Builder setCourseNum (String courseNum){
           this.courseNum = courseNum;
           return this;
       }

       public Builder setCourseName(String courseName){
           this.courseName = courseName;
           return this;
       }

       public Course Build (){
           return new Course(this);
       }
    }
}
