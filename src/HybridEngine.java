





public class HybridEngine implements Engine {


    GasEngine gasEngine;
    ElectricEngine electricEngine;
    private int currentEngineSpeed = 0;



    HybridEngine(GasEngine gasEngine, ElectricEngine electricEngine) {
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
    }

    private Engine usedEngine(){
        if(currentEngineSpeed <= 50){
            return electricEngine;
        }else {
            return gasEngine;
        }
    }

    @Override
    public void increase() {
        currentEngineSpeed++;
        usedEngine().increase();
        System.out.println(usedEngine() + " is used from hybrid engine, increasing and speed is " + currentEngineSpeed);
    }

    @Override
    public void decrease() {
        currentEngineSpeed--;
        usedEngine().decrease();
        System.out.println(usedEngine() + " is used from hybrid engine, decreasing and speed is " + currentEngineSpeed);
    }

    @Override
    public int getSpeed() {
        return currentEngineSpeed;
    }


}
