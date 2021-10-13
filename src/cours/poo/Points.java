package cours.poo;

public class Points {

    public double x;
    public double y;

    public Points(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Points arg){
        double distance = Math.sqrt(Math.pow((arg.x - this.x),2) +Math.pow((arg.y - this.y),2));
       return distance;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
