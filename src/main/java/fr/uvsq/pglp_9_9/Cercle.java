package fr.uvsq.pglp_9_9;

public class Cercle implements Shape {

    private Point p;
    private String id;
    private int rayon;
    
    public Cercle(final Point pPoint, final String pName, final int pRayon) {
        this.p = pPoint;
        this.id = pName;
        this.rayon = pRayon;
    }

    public void deplace(final Point pPoint) {
       this.p = pPoint;
    }

    public String toString() {
        return "Cercle(centre=" +  p.toString() + ",rayon="+ this.rayon + ")";
    }

    public Point getPoint() {
        return this.p;
    }

    public String getId() {
        return this.id;
    }
    
    public int getRayon() {
        return this.rayon;
    }

}

