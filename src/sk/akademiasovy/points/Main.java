package sk.akademiasovy.points;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(8,12);
        System.out.println("Point p1 is in " + p1.getQuadrant() + " quadrant");

        Point p2 = new Point();
        p2.generateRandomCor();
        System.out.println("Point p2 is in " + p2.getQuadrant() + " quadrant");
        System.out.println(p2.getDistance());
        p2.printInfo();
        System.out.println("Distance between points: " + p2.getDistanceFromOtherPoint(p1));
        p2.printInfo();
        Geometry g1 = new Point3d();
        ((Point)g1).printInfo();    //Prv ide v zatvorke typ na ktorý to chceme pretypovat a za zatvorkou ide bodka .
                                    //Nemozeme vytvarat New Interface .     Polymorfizmus = mnohotvarnosť .


        Geometry arr = new Geometry[10];
        Point3d temp = new Point3d();
        p1.generateRandomCor();

        Point point15 = new Point(2,3);

        Line line = new Line(point15,new Point(3,4));    //mozeme vytvarat priamo nemusime specialne pre premenu vytvarat newPoint
                                                            // moze s tymto bodom pracovat len premena Line nemoze s tym dalej pracvat main ,
        Line line2 = new Line(1,6,4,5);
        System.out.println("Length on the  line 1 is " +line.getLength());
        System.out.println("Midle point of Line is " +line.getMindlePoint());


    }
}
