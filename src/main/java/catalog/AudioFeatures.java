package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private final List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    @Override
    public String toString() {
        return composer + " " +  length + " " + " " +  performers + " " + title;
    }

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title) || length < 0 || Validators.isEmpty(performers)){
            throw new IllegalArgumentException("Invalid parameter!");
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        composer = new ArrayList<>();

    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.length = length;
        this.performers = performers;
        this.title = title;
        this.composer = composer;
    }

    public List<String> getContributors(){
        List<String> contributors = new ArrayList<>();
        contributors.addAll(composer);
        contributors.addAll(performers);
        return new ArrayList<>(contributors);
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }
}

