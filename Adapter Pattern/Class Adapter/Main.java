public class Main{
    public static void main(String[] args) {
        Pizza adaptedPizza = new ChittagongClassAdapter();
        adaptedPizza.toppings();  // Calls sausage() internally
        adaptedPizza.bun();       // Calls bread() internally

}
