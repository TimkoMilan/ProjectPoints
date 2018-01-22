package sk.akademiasovy.points;

public class Line {
    private Point a ;
    private Point b ;

    public Line(Point a , Point b ){
        this.a = a;
        this.b = b;

    }
    public Line(int Xa,int Ya , int Xb , int Yb){
        a = new Point(Xa , Ya);
        b = new Point(Xb , Yb);
    }
    public double getLength(){
        return a.getDistanceFromOtherPoint(b);
    }
    public Point getMindlePoint(){
        return new Point(a.getX()+b.getX())
    }

    public boolean isParalelToAxisY(int Xa , int Xb){
        if (Xa == Xb){
                return true;
        }
        else {
            return false;
        }
    }

    public boolean isParalelToAxisX(int Ya , int Yb){
        if (Ya == Yb){
            return true;
        }
        else
        {
            return false;
        }
    }
}
