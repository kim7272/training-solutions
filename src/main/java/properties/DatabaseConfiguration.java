package properties;

import java.io.*;
import java.util.Properties;


public class DatabaseConfiguration{

    private Properties properties;

    public DatabaseConfiguration(File file) {
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
        ) {
            load(fileInputStream);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    public DatabaseConfiguration() {

         try (InputStream is = DatabaseConfiguration.class.getResourceAsStream("/db.properties")){
            load(is);
         }
         catch (IOException e){
         throw new IllegalStateException("Can not load file", e);
         }
    }

    private Properties load(InputStream inputStream) {
        properties = new Properties();
        try (
                InputStreamReader reader = new InputStreamReader(inputStream, "UTF8");
        ) {
            properties.load(reader);
            return properties;
        } catch (IOException ioe) {
            throw new RuntimeException("Cannot read properties file from inputstream", ioe);
        }
    }



    public String getHost(){
       String result = properties.getProperty("db.host");
        return result;
    }

    public int getPort(){
        int result = Integer.parseInt(properties.getProperty("db.port"));
        return result;
    }

    public String getSchema(){
        String result = properties.getProperty("db.schema");
        return result;
        }
    }



