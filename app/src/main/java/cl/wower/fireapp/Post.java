package cl.wower.fireapp;

/**
 * Created by JuanCarlos on 29-09-17.
 */

public class Post {
    String title, description;

    public Post() {
    }

    public Post(String title, String description) {
        this.title = title;
        this.description = description;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
