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
public class Rectangle {

    private Point topLeftPoint;
    private double heigth;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point(5,0);
        heigth = 5.0;
        width = 6.0;
    }

    public Rectangle(Point topLeftPoint, double heigth, double width) {
        this.topLeftPoint = topLeftPoint;
        this.heigth = heigth;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        double area = width * heigth;
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = (width*2) + (heigth*2);
        return perimeter;
    }
    
    public boolean contains(Point point){
        boolean contains = false;
        Point topRightPoint = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRightPoint = new Point(topLeftPoint.getX() + width, topLeftPoint.getY() - heigth);
        Point bottomLeftPoint = new Point(topLeftPoint.getX(), topLeftPoint.getY() - heigth);
        
        if(point.getX() > topLeftPoint.getX() && point.getX() < topRightPoint.getX() 
            && point.getY() > bottomRightPoint.getY() && point.getY() < topRightPoint.getY()){
        contains = true;
        }
        return contains;
    }
}
