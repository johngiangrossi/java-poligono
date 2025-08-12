package Polygons.Quadrilaterals;
import Polygons.Polygon;

public abstract class quadrilateral extends Polygon {

    // fields
    private int late1;
    private int late2;
    private int late3;
    private int late4;

    // costruttore
    public quadrilateral(int sides, int late1, int late2, int late3, int late4) {
        super(0);
        if (late1 < 0 || late2 < 0 || late3 < 0 || late4 < 0) {
            System.out.println("hai inserito valori errati, inserisco quelli di default");
        }
        this.late1 = late1;
        this.late2 = late2;
        this.late3 = late3;
        this.late4 = late4;
    }


    // metodi
    // ottenere perimetro triangoli
    @Override
    public int getPerimeter() {
        return late1 + late2 + late3 + late4; 
    }

    // ottenere area triangoli
    @Override
    public abstract double getArea();

    // getters
    public int getLate1() {
        return late1;
    }

    public int getLate2() {
        return late2;
    }

    public int getLate3() {
        return late3;
    }


    public int getLate4() {
        return late4;
    }


    // setters
    public void setLate1(int late1) {
        if (late1 < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.late1 = late1;
        }
    }

    public void setLate2(int late2) {
        if (late2 < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.late2 = late2;
        }
    }

    public void setLate3(int late3) {
        if (late3 < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.late3 = late3;
        }
    }

    public void setLate4(int late4) {
        if (late4 < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.late4 = late4;
        }
    }

    
}

