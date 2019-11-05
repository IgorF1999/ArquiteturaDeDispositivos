/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int year, String brand, String model, double price, String color) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Year: " + year + ", Brand: " + brand + ", Model: " + model + ", Price: " + price + ", Color: " + color; //To change body of generated methods, choose Tools | Templates.
    }
    
}
