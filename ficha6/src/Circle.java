
import ficha5.Point;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }
    
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    
}
