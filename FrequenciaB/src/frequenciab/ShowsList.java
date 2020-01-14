/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenciab;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class ShowsList {
    private ArrayList<TVShow> series;


    public ShowsList() {
        series = new ArrayList<TVShow>();
    }

    public ShowsList(ArrayList<TVShow> series) {
        this.series = series;
    }

    ShowsList(TVShow series, TVShow documentary, TVShow miniserie) {
        
    }

    public ArrayList<TVShow> getSeries() {
        return series;
    }


    public void setSeries(ArrayList<TVShow> series) {
        this.series = series;
    }

    public void add(TVShow tvshow){
        series.add(new TVShow());
    }
    
}
