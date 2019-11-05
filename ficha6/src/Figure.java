
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Turma A
 */
public class Figure {

    private ArrayList<Shape> shapes;

    public Figure() {
    }

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    Circle c = new Circle();
    Triangle t = new Triangle();
    Rectangle r = new Rectangle();

    Figure fig = new Figure();
    /*
    fig.add(c);
    fig.add(t);
    fig.add(r);
    */
}
