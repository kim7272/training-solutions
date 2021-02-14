package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSumTest {

    @Test
    void sumNumbers() {

        FileSum fileSum = new FileSum();
        //System.out.println(fileSum.fileContent("number01.txt"));
        //System.out.println(fileSum.sumNumbers());

        int actual = new FileSum().sumNumbers();
        int expexted = 313;
    }
}