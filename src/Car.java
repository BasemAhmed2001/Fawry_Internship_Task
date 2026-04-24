import java.sql.SQLOutput;

public class Car {


    private Engine engine;
    //private int speed = 0;
    private boolean isEngineStarted = false;


    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        isEngineStarted = true;
        System.out.println("Start Car");
    }
    public void stop() {
        System.out.println("Stoping Car");
        while (engine.getSpeed() > 0) {
            engine.decrease();
        }
        isEngineStarted = false;
        System.out.println("Car stopped and speed is " + engine.getSpeed() + "km/h");
    }

    void accelerate() {
        if (!isEngineStarted) {
            System.out.println("Engine not started, please start engine first");
            return;
        }

        int targetSpeed = engine.getSpeed() + 20;
        System.out.println("Accelerating to target speed: " + targetSpeed + "km/h");
        while(engine.getSpeed() < targetSpeed && targetSpeed <= 200) {
            engine.increase();
        }
        System.out.println("Car accelerated to: " + engine.getSpeed() + "km/h");

    }

    void brake() {

        int targetSpeed = engine.getSpeed() - 20;
        System.out.println("Braking to target speed: " + targetSpeed + "km/h");
        while(engine.getSpeed() > targetSpeed) {
            engine.decrease();
        }
        System.out.println("Car braked to: " + engine.getSpeed() + "km/h");


    }



    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }




}
