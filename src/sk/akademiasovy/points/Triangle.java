package sk.akademiasovy.points;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }

    public double getSideB(){
        return c.getDistanceFromOtherPoint(a);
    }

    public double getSideC(){
        return a.getDistanceFromOtherPoint(b);
    }

    public double getPerimetertOfTriangel(){
        return getSideA() + getSideB() + getSideC();
    }
    public double capacityOfTriangel(){
        
    }
}
