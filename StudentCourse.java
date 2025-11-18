public class StudentCourse {
    private String name;
    private String department;
    private Instructor instructor;
    private double grade;
    private char semester;
    private int year;
    public StudentCourse(String name, String department, Instructor instructor, double grade, char semester, int year) {
        this.name = name;
        this.department = department;
        this.instructor = instructor;
        this.grade = grade;
        this.semester = semester;
        this.year = year;
    }
    public String getName() {
        return this.name;
    }
    public String getDepartment() {
        return this.department;
    }
    public Instructor getInstructor() {
        return this.instructor;
    }
    public double getGrade() {
        return this.grade;
    }
    public char getSemester() {
        return this.semester;
    }
    public int getYear() {
        return this.year;
    }
    public void setName(String name) {
        this.name = name;
    }   
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setSemester(char semester) {
        this.semester = semester;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Course: " + this.name + ",Department: " + this.department + ",Instructor: " + this.instructor.getName() + ",Grade: " + this.grade + ",Semester: " + this.semester + ",Year: " + this.year;
    }
    public boolean equals(StudentCourse sc2) {
        if(this.name.equals(sc2.name) && this.department.equals(sc2.department) && this.instructor.equals(sc2.instructor) && this.grade == sc2.grade && this.semester == sc2.semester && this.year == sc2.year){
            return true;
        } else {
            return false;
        }
       
    }
    public static void main(String[] args) {
      
        Instructor i1 = new Instructor("Dr.Gianna", "Park", 300);
        StudentCourse c1 = new StudentCourse("cs113", "computer science", i1, 3.0, 'F', 25);
        System.out.println("c1 name: " + c1.getName());
        System.out.println("c1 department: " + c1.getDepartment());
        System.out.println("c1 instructor: " + c1.getInstructor().getName());
        System.out.println("c1 grade: " + c1.getGrade());
        System.out.println("c1 semester: " + c1.getSemester());
        System.out.println("c1 year: " + c1.getYear());
        c1.setName("Intro to econ");
        c1.setDepartment("Economics");       
        c1.setGrade(3.9);
        c1.setSemester('S');
        c1.setYear(26);
        System.out.println(c1.toString());
        StudentCourse c2 = new StudentCourse("cs113", "computer science", i1, 4.0, 'F', 25);
        System.out.println(" is c1 equal to c2: " + c1.equals(c2));
    }
}
