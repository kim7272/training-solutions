package catalog;

import java.util.List;

public class PrintedFeatures implements  Feature{

    private List<String> authors;
    private int numberOfPages;
    private String title;

    @Override
    public String toString() {
        return  authors + " " + " " + numberOfPages + " " + title;
    }

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {

        if (Validators.isBlank(title) || numberOfPages < 0){
            throw new IllegalArgumentException("Empty title");
        }
        if (Validators.isEmpty(authors)){
            throw new IllegalArgumentException("Invalid parameter!");
        }

            this.authors = authors;
            this.numberOfPages = numberOfPages;
            this.title = title;
       }


    @Override
    public List<String> getContributors(){
        return authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

