import java.util.ArrayList;

public class CafeBusinessTest {
    public static void main(String[] args){
        CafeBusiness cb = new CafeBusiness();

        cb.getStreakGoal(10);
        cb.getOrderTotal(2,1,6,4);
        cb.displayMenu();
        ArrayList<String> customers = new ArrayList<String>();
        cb.addCustomer(customers);

        for (int i = 0; i < 3; i++) {
            cb.addCustomer(customers);
            System.out.println("\n");
    }
    
}
}