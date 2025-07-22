package Poligoni;

public class triangolo implements poligono {

    // fields
    private int base;
    private int height;
    private int late1;
    private int late2;
    private int late3;

    // costruttore
    public triangolo(int base, int height, int late1, int late2, int late3) {
        if (base < 0 || height < 0 || late1 < 0 || late2 < 0 || late3 < 0) {
            System.out.println("hai inserito valori errati, inserisco quelli di default");
        }
        this.base = base;
        this.height = height;
        this.late1 = late1;
        this.late2 = late2;
        this.late3 = late3;
    }

    // metodi
    @Override
    public int calculatePerimeter() {
        return late1 + late2 + late3; 
    }

    @Override
    public int calculateArea() {
        return (base * height) / 2;
    }

    // getters
    public int getBase() {
        return base;
    }
    
    public int getHeight() {
        return height;
    }

    public int getLate1() {
        return late1;
    }

    public int getLate2() {
        return late2;
    }

    public int getLate3() {
        return late3;
    }
    

    // setters
    public void setBase(int base) {
        if (base < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.base = base;
        }
    }

    public void setHeight(int height) {
        if (height < 0) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.height = height;
        }
    }

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

}
