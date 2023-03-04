// Series class that extends the Media class
public class Series extends Media {
    private int episodeCount;

    public Series(String kind,String title, String type, double IMDBRating, String director, String description, int episodeCount) {
        super(kind,title, type, IMDBRating, director, description,episodeCount);
        //this.episodeCount = episodeCount;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
        notifyObservers("series", getTitle());
    }
}