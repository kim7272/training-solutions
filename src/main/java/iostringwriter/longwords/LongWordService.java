 package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {



    public void writeLongWords(List<String> words, Writer writer){

        PrintWriter printWriter = new PrintWriter(writer);
            for (String word : words){
                printWriter.print(word);
                printWriter.print(":");
                printWriter.println(word.length());
            }
        }

    public String writeWithStringWriter(List<String> words){
        StringWriter sw = new StringWriter();
        try (sw) {
            writeLongWords(words, sw);
            return sw.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}


