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
public class Exame {

    private ShowsList listOfShows;

    public void create() {
        TVShow series = new TVShow("Dracula", 2020, 6.9, 120);
        System.out.println(series.toString());

        TVShow documentary = new Documentary("action", 8, "Investigacao Criminal", 2012, 8.2, 2);
        System.out.println(documentary.toString());

        TVShow miniserie = new MiniSeries(26, "The Punisher", 2017, 8.5, 2);
        System.out.println(miniserie.toString());

        listOfShows = new ShowsList(series, documentary, miniserie);
    }
    
    public static void main(String[] args) {
        Exame createShows = new Exame();
        createShows.create();
    }

}