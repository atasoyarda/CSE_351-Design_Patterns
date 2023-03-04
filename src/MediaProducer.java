public class MediaProducer extends MediaObservable{

    Media media;
    private static MediaProducer instance;
    private MediaProducer() {}

    public static MediaProducer getInstance() {
        if (instance == null) {
            instance = new MediaProducer();
        }
        return instance;
    }

    public Media produce(String kind, String title, String type, double IMDBRating,
                         String director, String description,int episode) {
        if (kind.equals("Movie")) {
            media = new Movie(kind, title, type, IMDBRating, director, description,0);
            notifyObservers(media.getKind(),media.getTitle());
        } else if (kind.equals("Series")) {
            media = new Series(kind, title, type, IMDBRating, director, description, episode);
            notifyObservers(media.getKind(),media.getTitle());
        }
        return media;
    }
}

