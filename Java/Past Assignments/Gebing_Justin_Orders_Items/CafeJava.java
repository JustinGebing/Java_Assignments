import java.util.ArrayList;

public class CafeJava { 
    public String item;
    public String item1;
    public String item2;
    public String item3;
    public double price;
    public double price1;
    public double price2;
    public double price3;

    public void howMuchCoffee() {
        System.out.printf("Ah yes, our %s is only %.2f", this.item, this.price);
    }

    public void howMuchMocha() {
        System.out.printf("Ah yes, our %s is only %.2f", this.item1, this.price1);
    }

    public void howMuchCap() {
        System.out.printf("Ah yes, our %s is only %.2f", this.item2, this.price2);
    }

    public void howMuchLatte() {
        System.out.printf("Ah yes, our %s is only %.2f", this.item3, this.price3);
    }


    public void greeting(){
        System.out.println("Hello, Welcome to CafeJava!");
        System.out.println("How may we assist you?");
    }
}

