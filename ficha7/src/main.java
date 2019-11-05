/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Turma A
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String start = Menu.Command.START.name();
        System.out.println(start);
        String save = Menu.Command.SAVE_GAME.name();
        System.out.println(save);
        String load = Menu.Command.LOAD_GAME.name();
        System.out.println(load);
        String high = Menu.Command.HIGH_SCORES.name();
        System.out.println(high);
        String quit = Menu.Command.QUIT.name();
        System.out.println(quit);
        /*Rational r1 = new Rational(7,3);
        Rational r2 = new Rational(2,5);
        Rational r3 = new Rational(2,6);
        Rational r4 = new Rational(2,7);
      
        ArrayList<Rational> rationals = new ArrayList<>();
        */
    }
    
}