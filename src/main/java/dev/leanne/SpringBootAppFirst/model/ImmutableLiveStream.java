package dev.leanne.SpringBootAppFirst.model;

import java.util.Objects;

public class ImmutableLiveStream {
    // final makes the data immutable
    private final String id;
    private final String title;
    private final String url;
    private final String description;

    public ImmutableLiveStream(String id, String title, String url, String description) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableLiveStream that = (ImmutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && url.equals(that.url) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, url, description);
    }

    @Override
    public String toString() {
        return "ImmutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
