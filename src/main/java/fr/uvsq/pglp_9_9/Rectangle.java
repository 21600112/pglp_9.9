package fr.uvsq.pglp_9_9;

public class Rectangle implements Shape {

    private Point p;
    private String id;
    private int sizeL;
    private int sizeH;
    
    public Rectangle(final Point pPoint, final String pName, final int pSizeL, final int pSizeH) {
        this.p = pPoint;
        this.id = pName;
        this.sizeL = pSizeL;
        this.sizeH = pSizeH;
    }

    public void deplace(final Point pPoint) {
       this.p = pPoint;
    }

    public String toString() {
        return "Rectangle(centre=" +  p.toString() + ")";
    }

    public Point getPoint() {
        return this.p;
    }

    public String getId() {
        return this.id;
    }
    
    public int getSizeL() {
        return this.sizeL;
    }
    
    public int getSizeH() {
        return this.sizeH;
    }

}
