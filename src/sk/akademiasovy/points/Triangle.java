package sk.akademiasovy.points;

public class  Triangle implements InterfaceTriangle {
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


    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        double area = Math.sqrt(s*s-getSideA())*(s*s-getSideC());
        return area ;
    }

    @Override
    public boolean isRectangular() {
        return false;
    }

    @Override
    /*public boolean isRectangular() {
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();

        if (a*a + b*b == c*c){
            return true;
        }
        else false;
    }
*/
    @Override
    public void isEquilateral() {
        return true;
    }

    @Override
    public boolean isIsosceles() {
        double sideA = b.getDistanceFromOtherPoint(c);
        double sideB = a.getDistanceFromOtherPoint(b);
        double sideC = a.getDistanceFromOtherPoint(c);

        if (sideA == sideB){
            return true;
        }
        if (sideA == sideC){
            return true;
        }
        if (sideC == sideB){
            return true;
        }
        else {
            return false;
        }
    }

   /* @Override
    public boolean isEquilateral() {
        if (getSideA() == getSideB() == getSideC()) return true;
        else return false;

    }

       return getSideA() == getSideB();
    */

  }

