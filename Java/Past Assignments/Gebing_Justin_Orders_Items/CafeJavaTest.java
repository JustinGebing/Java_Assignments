
public class CafeJavaTest {
    public static void main (String[] args) {
        CafeJava cj = new CafeJava();
        custOrder custOrder = new custOrder();

        cj.item = "Coffee";
        cj.item1 = "Mocha";
        cj.item2 = "Capucchino";
        cj.item3 = "Latte";
        cj.price = 1.00;
        cj.price1 = 2.00;
        cj.price2 = 3.00;
        cj.price3 = 4.00;
        custOrder.name = "Cindhuri";
        custOrder.name1 = "Jimmy";
        custOrder.name2 = "Noah";
        custOrder.name3 = "Sam";
        // custOrder.total = price;
        // custOrder.total = price;
        // custOrder.total = price;
        // custOrder.total = price;
        custOrder.ready = true;
        custOrder.ready = true;
        custOrder.ready = false;
        custOrder.ready = false;
        custOrder.items.add("Coffee");
        custOrder.items.add("Mocha");
        custOrder.items.add("Capucchino");
        custOrder.items.add("Latte");


        cj.greeting();
        // cj.howMuchCoffee();
        // cj.howMuchMocha();
        // cj.howMuchCap();
        // cj.howMuchLatte();

    }
}
