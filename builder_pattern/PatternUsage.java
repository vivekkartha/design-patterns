package builder_pattern;

/**
 * Class demonstrating the usage of Builder pattern.
 */
public class PatternUsage {
    public static void main(String args[]) {
        //Making Favorite instance with Builder pattern
        Favorite favorite = new Favorite.Builder()
                .setArtist("Led Zeppelin")
                .setGenre("Rock")
                .build();

        //Making Customer instance with Builder pattern
        Customer customer = new Customer.Builder()
                .setName("Tony Stark")
                .withFavorites(favorite)
                .withSubscriptionType("Platinum")
                .build();
    }
}
