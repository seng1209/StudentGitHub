import Assignment.*;

public class Main {
    public static void main(String[] args) {
        /*Person person = new Person();
        person.setName("MengLeang");
        person.setAddress("Phnome Penh");*/
        Student student = new Student("Meng Leang", "Phnome Penh", 6);
        try {
            student.addCourseGrade("Java", 40);
            student.addCourseGrade("Network", 50);
            student.addCourseGrade("ISAD", 20);
            student.addCourseGrade("Math", 50);
            student.addCourseGrade("C#", 40);
            student.addCourseGrade("C++", 71);
            student.addCourseGrade("C", 23);
            student.addCourseGrade("English", 8);
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
        student.printGrade();
    }
}