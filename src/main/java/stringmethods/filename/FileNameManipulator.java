package stringmethods.filename;

public class FileNameManipulator {



    public char findLastCharacter(String str) {
        if (str == "" || str == null) {
            throw new IllegalArgumentException("Empty string!");
        }
        char lastChar = str.trim().charAt(str.trim().length() - 1);
        return lastChar;
    }
    public String findFileExtension(String fileName){
        if (fileName == null){
            throw new IllegalArgumentException("Invalid file name!");
        }
        if (fileName.trim() == "." || fileName.endsWith(".d") || fileName.trim() == ""){
        throw new IllegalArgumentException("Invalid file name!");
        }
        String justExtension = fileName.substring(fileName.indexOf("."));
        return justExtension;
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        if (ext == null || fileName == null)  {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if (fileName.trim().startsWith(".")  || fileName.trim() == "" || ext.trim() == "") {
        throw new IllegalArgumentException("Invalid argument!");
        }
        boolean b = (fileName.endsWith(ext)) ;
        return b;
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (searchedFileName == null || actualFileName == null || actualFileName.trim() == "" ||
            searchedFileName.trim() == "") {
            throw new IllegalArgumentException("Invalid argument!");
        }
        boolean b = searchedFileName.equalsIgnoreCase(actualFileName);
        return b;
    }
    public String changeExtensionToLowerCase(String fileName) {
        if (fileName.trim() == ""){
        throw new IllegalArgumentException(("Empty string!"));
        }
        if (fileName == "." || fileName == new FileNameManipulator().findFileExtension(fileName)){
        throw new IllegalArgumentException(("Invalid argument!"));
        }
        String extension = new FileNameManipulator().findFileExtension(fileName);
        String lowerExtension = new FileNameManipulator().findFileExtension(fileName).toLowerCase();
        String changedExtensionToLow = new FileNameManipulator().replaceStringPart(fileName,extension,lowerExtension);
        return changedExtensionToLow;
    }
    public String replaceStringPart(String fileName, String present, String target) {
        if (fileName == null){
        throw new IllegalArgumentException("Empty string!");
        }
        if (fileName.trim() == "" ){
        throw new IllegalArgumentException("Empty string!");
        }
        String changedString = fileName.replace(present, target);
        return changedString;
    }

}
