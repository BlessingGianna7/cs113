public class Student {
    private String name;
    private String major;
    private StudentCourse[] courses;
    private int numOfCourses;
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.numOfCourses = 5;
        this.courses = new StudentCourse[numOfCourses];
    }
    public String getName() {
        return this.name;
    }
    public String getMajor() {
        return this.major;
    }
    public StudentCourse[] getCourses() {
        return this.courses;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setCourses(StudentCourse[] courses) {
        this.courses = courses;
        this.numOfCourses = courses.length;
    }
    public String toString() {
        String part1 = "Student: " + this.name + ", Major: " + this.major + ", Courses Taken: " + this.numOfCourses + "and the Courses are:";
        String part2 = "";
        for (int i = 0; i < this.numOfCourses; i++) {
            part2 += this.courses[i].toString();
        }
        return part1 + part2;
    }
    public boolean equals(Student sc2) {
        if(this.name.equals(sc2.name) && this.major.equals(sc2.major)){
            if (this.numOfCourses != sc2.numOfCourses) {
                return false;
            }
            for (int i = 0; i < this.numOfCourses; i++) {
                    if (!this.courses[i].equals(sc2.courses[i])) {
                        return false;
                    }
        
                }
            return true;
        } else {
            return false;
        }
       
    }
    public double computeGPA() {
        double total = 0.0;
        int count = 0;
        for (int i = 0; i < this.numOfCourses; i++) {
            total += this.courses[i].getGrade();
            count++;
        }
        if (count != 0){
            return total/count;
        }else{
            return 0.0;
        }
       
    }
    public double computeGPA(char semester) {
        double total = 0.0;
        int count = 0;
        for (int i = 0; i < this.numOfCourses; i++) {
            if (this.courses[i].getSemester() == semester) {
                total += this.courses[i].getGrade();
                count++;
            }
        }
        if (count != 0){
            return total/count;
        }else{
            return 0.0;
        }
    }
     public double computeGPA(int year) {
        double total = 0.0;
        int count = 0;
        for (int i = 0; i < this.numOfCourses; i++) {
            if (this.courses[i].getYear() == year) {
                total += this.courses[i].getGrade();
                count++;
            }
        }
        if (count != 0){
            return total/count;
        }else{
            return 0.0;
        }
    }
    public double computeGPA(char semester, int year) {
        int count = 0;
        double total = 0.0;
        for (int i = 0; i < this.numOfCourses; i++) {
            if (this.courses[i].getSemester() == semester && 
                this.courses[i].getYear() == year) {
                total += this.courses[i].getGrade();
                count++;
            }
        }
        if (count != 0){
            return total/count;
        }else{
            return 0.0;
        }
    }
    public void addCourse(StudentCourse course) {
            StudentCourse[] newCourses = new StudentCourse[this.courses.length + 1];
            for (int i = 0; i < this.courses.length; i++) {
                newCourses[i] = this.courses[i];
            }
            newCourses[this.numOfCourses] = course;
            this.courses = newCourses;  
            this.numOfCourses++;      

    }
}
