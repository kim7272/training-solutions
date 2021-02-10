package week14d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {

    @Test
    void sortNotebook() {

        Student student_1 = new Student("Bob");
        student_1.addNote("Mathematik",4);
        student_1.addNote("Mathematik",3);
        student_1.addNote("Biology",3);
        student_1.addNote("Biology",4);
        student_1.addNote("Chemistry",5);
        student_1.addNote("Chemistry",2);

        Student student_2= new Student("Fred");
        student_2.addNote("Mathematik",2);
        student_2.addNote("Mathematik",5);
        student_2.addNote("Biology",5);
        student_2.addNote("Biology",3);
        student_2.addNote("Chemistry",2);
        student_2.addNote("Chemistry",4);

        Student student_3= new Student("Joe");
        student_3.addNote("Mathematik",4);
        student_3.addNote("Mathematik",3);
        student_3.addNote("Biology",3);
        student_3.addNote("Biology",4);
        student_3.addNote("Chemistry",3);
        student_3.addNote("Chemistry",5);

        ClassNotebook classNotebook = new ClassNotebook(Arrays.asList(student_1,student_2,student_3));

        String actual = classNotebook.sortNotebook().toString();
        String expected = "[Bob, Fred, Joe]";

        assertEquals(expected, actual);


    }
}