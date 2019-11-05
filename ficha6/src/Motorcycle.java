/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Motorcycle extends Vehicle{
    
    private int wheels;

    public Motorcycle() {
        super();
        this.wheels = 0;
    }

    public Motorcycle(int wheels, int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
        this.wheels = wheels;
    }
    
    @Override
    public String toString() {
        return "This is a motorcycle with: " + wheels + " wheels. " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
