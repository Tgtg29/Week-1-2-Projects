public class Polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;

    public void Polygon(){
        numSides = 3;
        sideLength = 1.0;
        shapeType = "Triangle";
    }

    public void Polygon(int s, int sL, String sT){
        numSides = s;
        sideLength = sL;
        shapeType = sT;
    }

    public double getSideLength() {
        return sideLength;
    }

    public int getNumSides(){
        return numSides;
    }

    public String getShapeType(){
        return shapeType;
    }

}