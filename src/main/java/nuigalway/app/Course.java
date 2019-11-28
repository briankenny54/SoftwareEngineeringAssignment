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

    public String getName(){
        return name;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    void addModule(Module m){
        modules.add(m);
    }

    String printStudents(){
        if (students != null){
            for(Student s :students){
                return s.getName();
                //System.out.println(m.getName());
            }
        }else{
            System.out.println("empty");
        }
        return "";
    }
}
