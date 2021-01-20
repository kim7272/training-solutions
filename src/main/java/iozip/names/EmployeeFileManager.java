package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {

    public void saveEmployees(Path zipPath, List<String> employees) {

        try (ZipOutputStream os= new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(zipPath))
        )){
            os.putNextEntry(new ZipEntry(("names.dat")));
            for (String employee : employees){
                os.write(employee.getBytes());
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
