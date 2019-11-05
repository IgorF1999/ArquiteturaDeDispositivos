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
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle() { //contrutores por omissão
        this.a = new Point(1,1);
        this.b = new Point(4,1);
        this.c = new Point(4,4);
    }

    public Triangle(final Point a, final Point b, final Point c) { //construtores por parâmetros
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() { //seletores
        return a;
    }

    public Point getB() { //seletores
        return b;
    }

    public Point getC() { //seletores
        return c;
    }

    public void setA(Point a) { //procedimentos, alteração de atributo a
        this.a = a;
    }

    public void setB(Point b) { //procedimentos, alteração de atributo b
        this.b = b;
    }

    public void setC(Point c) { //procedimentos, alteração de atributo c
        this.c = c;
    }

    public double calculateBase() {
        return b.distanceTo(c);
    }

    public double calculateHeigth() {
        return b.distanceTo(a);
    }   

    public double calculateArea() {
        double base = calculateBase();
        double heigth = calculateHeigth();
        double area = (base * heigth) / 2;
        return area;
    }
}
