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
public class Point {

    private double x;
    private double y;

    public Point() { //contrutores por omissão
        x = 0.0;
        y = 0.0;
    }

    public Point(final double x, final double y) { //construtores por parâmetros
        this.x = x;
        this.y = y;
    }

    public double getX() { //seletores
        return x;
    }

    public double getY() { //seletores
        return y;
    }

    public void setX(double x) { //procedimentos, alteração de atributo x
        this.x = x;
    }

    public void setY(double y) { //procedimentos, alteração de atributo y
        this.y = y;
    }
    
    public double distanceTo(Point other){
        double distancia = Math.sqrt(Math.pow(other.x - this.x,2) + Math.pow(other.y - this.y, 2));
        return distancia;
    }
    
}
