package builder_pattern;

/**
 * Favorite object holding artist and genre preferences of a Customer
 */
public class Favorite {
    private String genre;
    private String artist;

    public Favorite(String genre, String artist) {
        this.genre = genre;
        this.artist = artist;
    }

    /**
     * Static Builder for Favorite object
     */
    public static class Builder {
        private String genre;
        private String artist;

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Favorite build() {
            return new Favorite(genre, artist);
        }
    }
}
