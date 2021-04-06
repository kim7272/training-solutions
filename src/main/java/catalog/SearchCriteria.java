package catalog;

public final class SearchCriteria {

    private static String contributor;
    private static String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static String getContributor() {
        return contributor;
    }

    public static String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (contributor == null || title == null){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        SearchCriteria searchCriteria = new SearchCriteria(contributor, title);
        return searchCriteria;
    }

    public static SearchCriteria createByContributor(String contributor) {
        title = null;
        if (contributor == null) {
            throw new IllegalArgumentException("Invalid parameter!");
        }
            return new SearchCriteria(contributor, getTitle());
    }

    public static SearchCriteria createByTitle(String title){
        contributor = null;
        if (title == null){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        return new SearchCriteria(getContributor(), title);
    }

    public boolean hasContributor(){
        return (SearchCriteria.getContributor() != null);
    }

    public boolean hasTitle(){
        return (SearchCriteria.getTitle() != null);
    }
}

