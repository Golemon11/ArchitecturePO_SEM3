package ArchitecturePO_SEM3.ISP;

public class Cube implements Shape, Shape3D {
    private int lengthEdge;

    public Cube(int lengthEdge) {
        this.lengthEdge = lengthEdge;
    }

    public int getLengthEdge() {
        return lengthEdge;
    }

    public void setLengthEdge(int lengthEdge) {
        this.lengthEdge = lengthEdge;
    }

    @Override
    public double area() {
        return lengthEdge*lengthEdge*6; 
    }

    @Override
    public double volume() {
        return Math.pow(lengthEdge, 3);
    }
    
}
