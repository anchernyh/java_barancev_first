package ru.stqa.pft.sandbox;

public class Distance {
    public double x1;
    public double x2;
    public double y1;
    public double y2;
    public String distance;

    public Distance(double x1, double x2,double y1, double y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double dist (){
        final var sqrt = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return sqrt;
    }
}
