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
public class MiniSeries extends TVShow{
    private int episodes;

    public MiniSeries() {
        super();
        this.episodes = 0;
    }

    public MiniSeries(int episodes, String name, int year, double rating, int duration) {
        super(name, year, rating, duration);
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "This MiniSeries has " + episodes + " episodes." + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
