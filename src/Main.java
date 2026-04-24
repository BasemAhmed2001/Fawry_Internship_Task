
public class Main {
    public static void main(String[] args) {


        // Electric Car
        System.out.println("------------------ Electric Car ------------------");

        Car electricCar = CarFactory.createCar('e');

        electricCar.accelerate();
        electricCar.start();
        for(int i = 0; i < 11; i++) {
            electricCar.accelerate();
        }
        electricCar.brake();
        electricCar.stop();

        // Gas Car
        System.out.println("------------------ Gas Car ------------------");
        Car gasCar = CarFactory.createCar('g');

        gasCar.accelerate();
        gasCar.start();
        for(int i = 0; i < 11; i++) {
            gasCar.accelerate();
        }
        gasCar.brake();
        gasCar.stop();
        CarFactory.replaceEngine(gasCar, 'e');
        gasCar.accelerate();
        gasCar.start();
        gasCar.accelerate();


        // Hybrid Car
        System.out.println("------------------ Hybrid Car ------------------");
        Car hybridCar = CarFactory.createCar('h');

        hybridCar.accelerate();
        hybridCar.start();
        for(int i = 0; i < 11; i++) {
            hybridCar.accelerate();
        }
        hybridCar.brake();
        hybridCar.stop();




    }
}