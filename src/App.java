
import Polygons.Polygon;
import Polygons.Quadrilaterals.genericQuadrilateral;
import Polygons.Quadrilaterals.rectangle;
import Polygons.Triangles.genericTriangle;
import Polygons.Triangles.triangleEquilateral;
import Polygons.Triangles.triangleIsosceles;
import Polygons.Triangles.triangleScalene;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Creare un’interfaccia Poligono con due metodi: calcolaPerimetro() e calcolaArea().
        Creare almeno due classi concrete che rappresentano dei poligoni e che implementano l’interfaccia. 
        Ogni classe può avere un insieme di propri attributi e anche altri metodi oltre a quelli dell’interfaccia.
        Creare una classe Main di test in cui generare delle istanze dei poligoni
        */

        // con poligoni
        // triangolo triangle1 = new triangolo(5, 2, 5, 5, 5);
        // System.out.println(triangle1.calculateArea());


        // con polygons
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di lati che vuoi tra 3 o 4");
        int sidesInput = scanner.nextInt();

        Polygon polygon1 = null;

        if (sidesInput == 3) {

            System.out.println("inserisci la dimensione de lato 1");
            int side1Input = scanner.nextInt();
            System.out.println("inserisci la dimensione de lato 2");
            int side2Input = scanner.nextInt();
            System.out.println("inserisci la dimensione de lato 3");
            int side3Input = scanner.nextInt();

            polygon1 = new genericTriangle(sidesInput, side1Input, side2Input, side3Input);
            
            if (side1Input == side2Input && side2Input == side3Input) {
                polygon1 = new triangleEquilateral(sidesInput, side1Input, side2Input, side3Input);
            } else if (side1Input == side2Input || side2Input == side3Input || side1Input == side3Input) {
                polygon1 = new triangleIsosceles(sidesInput, side1Input, side2Input, side3Input);
            } else {
                polygon1 = new triangleScalene(sidesInput, side1Input, side2Input, side3Input);
            }
            System.out.println("il perimetro del triangolo è: " + polygon1.getPerimeter());
            System.out.println(String.format("l'area del triangolo è: %.2f", polygon1.getArea()));
            System.out.println(polygon1.toString());

        } else if (sidesInput == 4) {

            System.out.println("inserisci la dimensione de lato 1");
            int side1Input = scanner.nextInt();
            System.out.println("inserisci la dimensione de lato 2");
            int side2Input = scanner.nextInt();
            System.out.println("inserisci la dimensione de lato 3");
            int side3Input = scanner.nextInt();
            System.out.println("inserisci la dimensione de lato 4");
            int side4Input = scanner.nextInt();

            polygon1 = new genericQuadrilateral(sidesInput, side1Input, side2Input, side3Input, side4Input);
            
            if (side1Input == side3Input && side2Input == side4Input) {
                polygon1 = new rectangle(sidesInput, side1Input, side2Input, side3Input, side4Input);
            } 
            System.out.println("il perimetro è: " + polygon1.getPerimeter());
            System.out.println(String.format("l'area è: %.2f", polygon1.getArea()));
            System.out.println(polygon1.toString());

        }
        

    }
}
