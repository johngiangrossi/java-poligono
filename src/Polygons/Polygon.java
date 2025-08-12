package Polygons;

import Polygons.interfaces.calculate;

public abstract class Polygon implements calculate{

    // fields
    private int sides;

    
    // costruttore
    public Polygon(int sides) {
        if(sides < 0){
            System.out.println("hai inserito valori errati, inserisco quelli di default");
        } else {
            this.sides = sides;
        }
    }


    // metodi
    @Override
    public abstract int getPerimeter();

    @Override
    public abstract double getArea();

    @Override
    public String toString() {
        return "hai creato un poligono con: " + sides;
    }

    

    // getters
    public int getSides() {
        return sides;
    }
    

    // setters
    public void setSides(int sides) {
        this.sides = sides;
    }


}
