package Polygons.Quadrilaterals;

public class rectangle extends quadrilateral {

    // costruttore
    public rectangle(int sides, int late1, int late2, int late3, int late4) {
        super(sides, late1, late2, late3, late4);
    }

    // metodi
    // per avere stringa che dichiara tipo di triangolo
    @Override
    public String toString() {
        return super.toString() + " ed è un rettangolo";
    }

    // per avere area
    @Override
    public double getArea() {
        return getLate1() * getLate2();
    }   

}
