public class Main {
    public static void main(String[] args) {

        MediaProducer mediaCreator = MediaProducer.getInstance();
        User user1 = new User("Arda");
        User user2 = new User("Ali");
        User user3 = new User("George");
        User user4 = new User("Can");
        Media movie1 = mediaCreator.produce
                ("Movie","Inception", "Action", 8.8, "Christopher Nolan",
                        "A thief who enters the subconscious of his targets is offered a chance to regain " +
                                "his old life as payment for a task considered to be impossible.",1);
        mediaCreator.attach(user1);
        Media movie2 = mediaCreator.produce
                ("Movie","The Shawshank Redemption", "Drama", 9.3, "Frank Darabont",
                        "Two imprisoned men bond over a number of years, finding solace and eventual " +
                                    "redemption through acts of common decency.",1);

        Media series1 = mediaCreator.produce("Series","Breaking Bad", "Crime", 9.5,
                "Vince Gilligan", "A high school chemistry teacher diagnosed with inoperable lung" +
                        " cancer turns to manufacturing and selling methamphetamine in order to secure his family's " +
                        "future.", 5);
        mediaCreator.attach(user2);
        Media series2 = mediaCreator.produce("Series","Game of Thrones", "Fantasy", 9.3,
                "David Benioff", "Nine noble families fight for control over the mythical lands of " +
                        "Westeros, while a forgotten race returns after being dormant for thousands of years.", 8);

        mediaCreator.attach(user3);
        Media movie3 = mediaCreator.produce("Movie","Interstellar", "Sci-Fi",
                8.6, "Christopher Nolan", "A team of explorers travel through a wormhole" +
                        " in space in an attempt to ensure humanity's survival.", 0);



    }
}


