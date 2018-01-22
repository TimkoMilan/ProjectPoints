package sk.akademiasovy.points;

import java.util.Random;

public class Point3d extends Point {
    public int z ;

    public int getZ (){
        return z;
    }

    public Point3d(){
        z=0;
    }

     public Point3d(int x,int y, int z){
        super(x,y);     // zavola sa konstruktor v treide point kde zavola 2 čisla

        this.z = z;
     }

    @Override
    public double getDistance() {
        return Math.sqrt(getX()*getX() + getY()* getY());
    }

    @Override
    public void generateRandomCor() {
        Random random=new Random();
        this.z=random.nextInt(41)-20;
        super.generateRandomCor();
    }

    public double getDistanceFromOtherPoint(Point3d other){
        return Math.sqrt(Math.pow(getX()-other.getX(),2) + Math.pow(getY()-other.getY(),2)+Math.pow(z-other.getZ(),2));
    }

    @Override
    public void print(){
        System.out.println("Point3D: ["+getX()+","+getY()+","+z+"] Dist: "+getDistance());
    }



}
