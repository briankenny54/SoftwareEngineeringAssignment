package nuigalway.app;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String coursename, ArrayList<Module> modules, ArrayList<Student> students, LocalDate startdate, LocalDate enddate){
        this.name = coursename;
        this.modules = modules;
        this.students = students;
    }

    private String getName(){
        return name;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    void addModule(Module m){
        modules.add(m);
    }
}
