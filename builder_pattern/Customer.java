package builder_pattern;

/**
 * Builder pattern - Used to build more meaningful and readable objects.
 */
public class Customer {
    private String name;
    private String type;
    private Favorite favorite;

    public Customer(String name, String type, Favorite favorite) {
        this.name = name;
        this.type = type;
        this.favorite = favorite;
    }

    /**
     * Static Builder for Customer.The methods
     * (other than build()) can be called in any order
     */
    public static class Builder {
        private String name;
        private String type;
        private Favorite favorite;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSubscriptionType(String type) {
            this.type = type;
            return this;
        }

        public Builder withFavorites(Favorite favorite) {
            this.favorite = favorite;
            return this;
        }

        /**
         * Calling build validates the parameters(if needed),
         * and creates the Customer object
         **/
        public Customer build() {
            return new Customer(name, type, favorite);
        }
    }
}
