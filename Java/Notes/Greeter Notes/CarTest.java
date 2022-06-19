public class CarTest {
    public static void main(String[] args){
        clientCar client1car = new clientCar();
        client1car.year = 2001;
        client1car.make = "Honda";
        client1car.model = "Civic";
        client1car.color = "White";

        clientCar client2car = new clientCar();
        client2car.year = 2018;
        client2car.make = "Mazda";
        client2car.model = "CX-3";
        client2car.color = "Navy Blue";

        System.out.println("Car 1 make: " + client1car.make);
        System.out.println("Car 1 model: " + client1car.model);

        System.out.println("Car 2 make: " + client2car.make);
        System.out.println("Car 2 model: " + client2car.model);

    }
}
