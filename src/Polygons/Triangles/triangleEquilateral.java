package Polygons.Triangles;

public class triangleEquilateral extends triangle {

    // costruttore
    public triangleEquilateral(int sides, int late1, int late2, int late3) {
        super(sides, late1, late2, late3);
    }

    // metodi
    // per avere stringa che dichiara tipo di triangolo
    @Override
    public String toString() {
        return super.toString() + " ed è un triangolo è equilatero";
    }

    

}
