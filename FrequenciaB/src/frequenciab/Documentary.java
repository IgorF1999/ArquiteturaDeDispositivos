/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenciab;

/**
 *
 * @author Turma A
 */
public class Documentary extends TVShow{
    private String genre;
    private int seasons;

    public Documentary() {
        super();
        this.genre = "";
        this.seasons = 0;
    }
    
    public Documentary(String genre, int seasons, String name, int year, double rating, int duration) {
        super(name, year, rating, duration);
        this.genre = genre;
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "This is an " + genre + " Documentary and has " + seasons + " seasons." + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
