public class CafeJavaTest {
        public static void main(String[] args) {
            String generalGreeting = "Welcome to Cafe Java, ";
            String pendingMessage = ", your order will be ready shortly";
            String readyMessage = ", your order is ready";
            String displayTotalMessage = "Your total is $";
    
            double blackCoffee = 1.00;
            double capucchino = 2.50;
            double lattes = 1.50;
    
            String customer1 = "Cindhuri";
            String customer2 = "Sam";
            String customer3 = "Jimmy";
            String customer4 = "Noah";
    
            boolean isReadyOrder1 = true;
            boolean isReadyOrder2 = false;
            boolean isReadyOrder3 = false;
            boolean isReadyOrder4 = true;
    
            String divider = "-----------------------------------------";
    
            System.out.println(generalGreeting + customer1 + "!");
            double total = blackCoffee;
            System.out.println(displayTotalMessage+total);
            if(isReadyOrder1) {
                System.out.println(customer1 + readyMessage);
            } else {
                System.out.println(customer1 + pendingMessage);
            }
            System.out.println(divider);
    
            System.out.println(generalGreeting + customer4 + "!");
            double total2 = capucchino;
            System.out.println(displayTotalMessage+total2);
            if(isReadyOrder4) {
                System.out.println(customer4 + readyMessage);
            } else {
                System.out.println(customer4 + pendingMessage);
            }
            System.out.println(divider);
    
            System.out.println(generalGreeting + customer2 + "!");
            double total3 = lattes + lattes;
            System.out.println(displayTotalMessage+total3);
            if(isReadyOrder3) {
                System.out.println(customer2 + readyMessage);
            } else {
                System.out.println(customer2 + pendingMessage);
            }
            System.out.println(divider);
    
            System.out.println(generalGreeting + customer3 + "!");
            double total4 = blackCoffee;
            System.out.println(displayTotalMessage+total4);
            if(isReadyOrder2) {
                System.out.println(customer3 + readyMessage);
            } else {
                System.out.println(customer3 + pendingMessage);
            }
            System.out.println(divider);
            System.out.println("That's our mistake, " + customer3 + "!");
            double total5 = lattes - blackCoffee;
            System.out.println(displayTotalMessage+total5);
        }
        
    }
