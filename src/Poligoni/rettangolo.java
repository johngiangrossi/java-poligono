package Poligoni;

public class rettangolo implements interfaccia {

    // fields
    private int base;
    private int height;

    // costruttore
    public rettangolo(int base, int height) {
        if (base < 0 || height < 0) {
            System.out.println("hai inserito valori errati, inserisco quelli di default");
        }
        this.base = base;
        this.height = height;
    }

    // metodi
    @Override
    public int calculatePerimeter() {
        return (base + height) * 2; 
    }

    @Override
    public int calculateArea() {
        return base * height;
    }

    // getters
    public int getBase() {
        return base;
    }
    
    public int getHeight() {
        return height;
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
}
