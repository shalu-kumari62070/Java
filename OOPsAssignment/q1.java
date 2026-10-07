/*
1.0   Modify class GradeBook (below figure) as follows:  
a) Include a String instance variable that represents the name of the course’s  instructor. 
b) Provide a set method to change the instructor’s name and a get method to retrieve it. 
c) Modify the constructor to specify two parameters—one for the course name and one for the instructor’s name.  
d) Modify method displayMessage to output the welcome message and course name, followed by "This course is presented by: " and the instructor’s name. 
*/

class GradeBook{
    private String courseName, instructorName;
    GradeBook(String cname, String iname){
        courseName = cname;
        instructorName = iname;
    }
    public void setCourseName(String name){
        courseName = name;
    }
    public void setInstructorName(String name){
        instructorName = name;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getInstructorName(){
        return instructorName;
    }
    // public void displayMessage(){
    //     System.out.println("Welcome " + getCourseName() + "\nfollowed by \nThis course is presented by: " + getInstructorName());
    // }
}

public class q1{
    public static void main(String[] args) {
        GradeBook gb = new GradeBook("Java", "Shalu Rajput");
        // gb.displayMessage();
        System.out.println(gb.getCourseName()); // Java
        System.out.println(gb.getInstructorName()); // Shalu Rajput
    }
}
/*
Welcome Java
followed by 
This course is presented by: Shalu Rajput
*/
