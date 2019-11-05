/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Car extends Vehicle{
    
    private int doors;

    public Car() {
        super();
        this.doors = 0;
    }

    public Car(int doors, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.doors = doors;
    }
    
    @Override
    public String toString() {
        return "This is a car with: " + doors + " doors. " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
