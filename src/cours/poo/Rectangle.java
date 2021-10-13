package cours.poo;

public class Rectangle {

    /**
     * create a template for rectangles
     * variables = length & width
     * calculate the rectangle's surface area
     */

    public int width;
    public int length;

    public Rectangle() {}

    //full constructor
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }


    //area method
    public double area() {
        double area = this.length * this.width;
        return area;
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
