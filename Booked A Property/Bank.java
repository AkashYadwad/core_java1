class Bank {
    public static void finance(String propertyName, double price) {
        double loanAmount = price * 0.8;
        System.out.println("Bank approves loan of ₹" + loanAmount + " for property: " + propertyName);
        Government.register(propertyName, price);
    }
}