class Builder {
    public static void construct(String propertyName, double price) {
        System.out.println("Builder constructs the property: " + propertyName);
        Bank.finance(propertyName, price);
    }
}