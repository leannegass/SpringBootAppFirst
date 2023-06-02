package dev.leanne.SpringBootAppFirst.model;

import java.util.Objects;

public class MutableLiveStream {
    private String id;
    private String title;
    private String url;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /*
    * equals to (==) returns true because they check memory reference
    * while hashcode checks for hash of the object which will be unique for each obj
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableLiveStream that = (MutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && url.equals(that.url) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, description);
    }
    /*
    * to string method to  convert data to string if it has Date or time or numbers */
    @Override
    public String toString() {
        return "MutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
