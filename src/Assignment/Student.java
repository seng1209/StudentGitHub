package Assignment;

public class Student extends Person{
    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private int numCourse;
    private String course;
    private int grade;
    public Student(String name, String address, int numCourse){
        super(name, address);
        this.numCourse = numCourse;
    }
    public void addCourseGrade(String course, int grade){
        count++;
        try {
            this.setCourse(course);
            this.setGrade(grade);
            arrCourse[j++] = this.getCourse();
            arrGrade[k++] = this.getGrade();
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
    int n = this.getNumCourse();
    String[] arrCourse = new String[10];
    int[] arrGrade = new int[10];
    int j = 0;
    int k = 0;
    static int count = 0;
    public void printGrade(){
        System.out.println(this.getName() + " " + this.getAddress());
        try{
            for (int i = 0;i<this.numCourse;i++){
                System.out.println(arrCourse[i] + " " + arrGrade[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Out index");
        }
    }
}
