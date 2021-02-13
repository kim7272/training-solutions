package week15d02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ExamQuestionsTest {

    @Test
    void questionsBySubject() {

        String actual = new ExamQuestions().questionsBySubject("magyar").toString();
        String expected = "[Hany predikator szerepel Moldova Gyorgy regenyenek cimeben?]";

        assertEquals(expected, actual);

    }

    @Test
    void randomQuestion() {

        Random random = new Random(15);
        String actual = new ExamQuestions().randomQuestion();
        String expected = "Hany megyeje van Magyarorszagnak?  19 1 foldrajz";

        assertEquals(expected, actual);
    }

   /* @Test
    void questionsByAllSubjects() {
        String actual = new ExamQuestions().QuestionsByAllSubjects().toString();
        String expected =
    }

    */

    @Test
    void subjectWithMaxScore() {

        String actual = new ExamQuestions().subjectWithMaxScore();
        String expexted = "matematika";

        assertEquals(expexted, actual);
         }
    }