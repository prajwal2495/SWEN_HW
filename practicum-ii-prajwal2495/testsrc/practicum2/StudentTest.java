package practicum2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testGrades(){
        // setup
        Student s1 = new Student("xyz","abc",1);
        Grade expected = Grade.D;

        //invoke
        s1.addGrade(s1.getPoints());
        Grade actual = s1.getGrades();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testDefaultID(){
        //setup
        Student s1 = new Student("xyz","abs",3.0);
        Student s2 = new Student("abc","qwe",2.22);
        double expected = 100002;

        //invoke
        double actual = s2.getID();

        //assert
        assertEquals(expected,actual);
    }


}