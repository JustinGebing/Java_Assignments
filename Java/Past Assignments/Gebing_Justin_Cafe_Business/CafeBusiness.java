import java.util.ArrayList;
import java.util.Arrays;

public class CafeBusiness {

    public void getStreakGoal(int weeks) {
        System.out.println("---- Streak Goal Test ----");
        int[] streak = new int[weeks];
        // System.out.println(Arrays.toString(streak));
        int sum = 0;
        for (int i=0; i<streak.length; i++) {
            streak[i] = i + 1;
            sum += streak[i];
        }
        // System.out.println(Arrays.toString(streak));
        System.out.println(sum);
    }

    public void getOrderTotal(double item0,double item1,double item2,double item3) {
        System.out.println("---- Order Total Test ----");
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(item0);
        prices.add(item1);
        prices.add(item2);
        prices.add(item3);

        System.out.println(prices);
        double sum = 0;
        for(int i=0; i<prices.size(); i++){
            sum += prices.get(i);
        }
        System.out.println(sum);
    }

    public void displayMenu() {
        System.out.println("---- Display Menu Test ----");
        ArrayList<String> orders = new ArrayList<>();
        // System.out.println(orders);
        
        orders.add(0, "Drip Coffee");
        orders.add(1, "Cappucino");
        orders.add(2, "Latte");
        orders.add(3, "Mocha");

        for (int i=0; i<orders.size(); i++){
            System.out.println(orders.indexOf(orders.get(i))+ " " + orders.get(i));
        }

        
    }
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("---- Add Customer Test ----");
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        System.out.printf("There are %s people ahead of you.\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
        }

    }
