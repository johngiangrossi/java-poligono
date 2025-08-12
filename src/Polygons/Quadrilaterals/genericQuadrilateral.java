package Polygons.Quadrilaterals;

public class genericQuadrilateral extends quadrilateral {

    // costruttore
    public genericQuadrilateral(int sides, int late1, int late2, int late3, int late4) {
        super(sides, late1, late2, late3, late4);
    }

    @Override
    public double getArea() {
        return 0.0;
    }

}
