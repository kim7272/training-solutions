package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    private Temperatures temperatures;
    private byte[] b;

    public Temperatures readTemperatures(String pathString){
        Path path = Path.of(pathString);
        try{
            b = Files.readAllBytes(path);
        }
        catch (IOException e){
            throw new IllegalStateException("Can not read file", e);
        }
        this.temperatures = new Temperatures(b);
        return this.temperatures;
    }

}
