class Buyer {
    public static void book(String propertyName, double price) {
        System.out.println("Buyer wants to book property: " + propertyName + " for ₹" + price);
        RealEstateAgent.sell(propertyName, price);
    }
}