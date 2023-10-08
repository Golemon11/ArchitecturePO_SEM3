package ArchitecturePO_SEM3.DIP;

public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        this.engine.start();
    }
    
}
