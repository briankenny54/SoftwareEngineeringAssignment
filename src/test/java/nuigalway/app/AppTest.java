package nuigalway.app;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */

        ArrayList<Student> modstulist = new ArrayList<Student>();
        ArrayList<Module> stumodlist = new ArrayList<Module>();
        ArrayList<Course> modcourselist = new ArrayList<Course>();
        ArrayList<Student> coursestulist = new ArrayList<Student>();
        ArrayList<Module> coursemodlist = new ArrayList<Module>();

        Student student = new Student("Joe", 22, "05/05/1997", 123234, "GY350", stumodlist);
        Module module = new Module("CT101", modstulist, modcourselist);
        Course course = new Course("GY350", coursemodlist, coursestulist, LocalDate.of(2019, 8, 31), LocalDate.of(2020, 5, 31));



//
//        course.addModule(module);
//        course.addStudent(student);


        @Test
        public void usernameTest ()
        {
            assertEquals("Correct", "Joe22", student.getUsername());
        }

        @Test
        public void modTest(){
            student.addModule(module);
            //module.addStudent(student);
            assertEquals("Correct", module.getName(), student.printModules());
        }

        @Test
        public void coursetest(){
            module.addCourse(course);
            assertEquals("Correct", course.getName(), module.printCourses());
        }

        @Test
        public void stuTest(){
            course.addStudent(student);
            assertEquals("Correct", student.getName(), course.printStudents());
        }

}
