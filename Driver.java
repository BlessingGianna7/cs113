import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Provide an input file");
            return;
        }

        String filename = args[0];
        Scanner s = new Scanner(new File(filename));
        while (s.hasNextLine()) {
            String line = s.nextLine(); 
        }
        s.close();
        StudentCourse course = new StudentCourse(Name, department, instructor, grade, semester, year); 
        student.addCourse(course);
    }




}
