// Movie class that extends the Media class
public class Movie extends Media {
    public Movie(String kind,String title, String type, double IMDBRating, String director, String description,int episodeCount) {
        super(kind,title, type, IMDBRating, director, description,episodeCount);
    }
}