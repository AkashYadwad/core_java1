class RealEstateAgent {
    public static void sell(String propertyName, double price) {
        System.out.println("Agent is selling the property: " + propertyName);
        Builder.construct(propertyName, price);
    }
}
