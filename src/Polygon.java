public class Polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;
    private double perimeter;

    public Polygon(){
        numSides = 3;
        sideLength = 1.0;
        shapeType = "Triangle";
    }

    public Polygon(int s, double sL, String sT){
        sideLength = sL;
        if(s < 3){
            numSides = 3;
            if(sideLength != 1.0){
                sideLength = 1.0;
            }else{
                sideLength = sL;
            }
        }else{
            numSides = s;
        }

        if(sT.equals("line")){
            shapeType = "Triangle";
        }else{
            shapeType = sT;
        }
//        numSides = s;
//        sideLength = sL;
//        shapeType = sT;
//        if(numSides < 3){
//            numSides = 3;
//        }
//        if(sideLength < 1.0){
//            sideLength = 1.0;
//        }
//        if(shapeType.equals("Line")){
//            shapeType = "Triangle";
//        }
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

    public void setSideLength(double newSideLength){
        sideLength = newSideLength;
    }

    public void setNumSides(int newNumSides){
        numSides = newNumSides;
    }

    public void setShapeName(String newShapeType){
        shapeType = newShapeType;
    }

    public double calculatePerimeter(){
        return numSides * sideLength;
    }

    public String toString(){
       return "Your shape is a " + shapeType + " and it has " + numSides + " sides." + "\nIt has a side length of " + sideLength + "." + "\nIt has a perimeter of " + calculatePerimeter() + " units.";
    }

}