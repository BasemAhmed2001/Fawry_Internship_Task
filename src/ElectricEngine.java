




public class ElectricEngine implements Engine{




    private int engineSpeed = 0;

    @Override
    public void increase() {
        engineSpeed++;
        System.out.println("Electric Engine Speed Increased +1: " + engineSpeed);
    }

    @Override
    public void decrease() {
        if(engineSpeed > 0)
            engineSpeed--;
        System.out.println("Electric Engine Speed Decreased -1: " + engineSpeed);
    }

    @Override
    public int getSpeed() {
        return engineSpeed;
    }

    @Override
    public String toString() {
        return "ElectricEngine";
    }
}

