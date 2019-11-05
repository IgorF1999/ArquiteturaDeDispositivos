/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5;

/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point topLeftPoint = new Point();

        Point p1 = new Point(3, 1);
        Point p2 = new Point(2, 3);

        Triangle t = new Triangle(a, b, c);

        double area = t.calculateArea();
        System.out.println(area);

        Rectangle r = new Rectangle(new Point(0, 3), 5, 3);

        double perimeter = r.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Contains: " + r.contains(p1));
    }

}
