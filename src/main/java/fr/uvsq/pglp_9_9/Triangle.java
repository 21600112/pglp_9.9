package fr.uvsq.pglp_9_9;

public class Triangle implements Shape {
	//triangle équilatéral
    private Point p;
    private String id;
    private int size;
    
    public Triangle(final Point pPoint, final String pName, final int pSize) {
        this.p = pPoint;
        this.id = pName;
        this.size = pSize;
    }

    public void deplace(final Point pPoint) {
       this.p = pPoint;
    }

    public String toString() {
        return "Triangle(centre=" +  p.toString() + ")";
    }

    public Point getPoint() {
        return this.p;
    }

    public String getId() {
        return this.id;
    }
    
    public int getSize() {
        return this.size;
    }

}

