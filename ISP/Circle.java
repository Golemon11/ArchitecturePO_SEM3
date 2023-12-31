package ArchitecturePO_SEM3.ISP;

public class Circle implements Shape{
  
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*3.14*radius;
    }
    
}
