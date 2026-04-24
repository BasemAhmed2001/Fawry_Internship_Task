


public class CarFactory {


        public static Car createCar(char type) {
            switch (type) {
                case 'g':
                    return new Car(new GasEngine());
                case 'e':
                    return new Car(new ElectricEngine());
                case 'h':
                    return new Car(new HybridEngine(new GasEngine(),  new ElectricEngine()));
                default:
                    throw new IllegalArgumentException("Invalid type");
            }
        }

        public static void replaceEngine(Car car, char type) {
            System.out.println("Replacing engine to: " + type);
            car.setEngine(createCar(type).getEngine());
        }



}
