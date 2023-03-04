import java.util.ArrayList;
import java.util.List;

// Abstract class for movies and series
public abstract class Media implements Subject {
    private String kind;
    private String title;
    private String type;
    private double IMDBRating;
    private String director;
    private String description;
    private List<Observer> observers;
    private int episodeCount;

    public Media(String kind, String title, String type, double IMDBRating, String director, String description, int episodeCount) {
        this.kind = kind;
        this.title = title;
        this.type = type;
        this.IMDBRating = IMDBRating;
        this.director = director;
        this.description = description;
        this.observers = new ArrayList<>();
        this.episodeCount = episodeCount;
    }

    public String getKind() {
        return kind;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public double getIMDBRating() {
        return IMDBRating;
    }

    public String getDirector() {
        return director;
    }

    public String getDescription() {
        return description;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int newCount) {
        episodeCount = newCount;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String updateType, String updateTitle) {
        for (Observer observer : observers) {
            observer.update(kind, title);
        }
    }

    public void addMedia() {
        notifyObservers("media", getTitle());
    }

    public void removeMedia() {
        notifyObservers("media", getTitle());
    }
}