package ioreadbytes.bytecount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ByteChecker {

    public int readBytesAndFindAs() {
        Path path = Path.of("src/main/resources/data.dat");
        int size = 0;
        int counter = 0;
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] buffer = new byte[1000];
            while ((size = inputStream.read(buffer)) > 0) {
                for (byte b : buffer) {
                    if (b == 97) {
                        counter = counter + 1;
                    }
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return counter;
    }
}


