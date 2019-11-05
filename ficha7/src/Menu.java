
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Turma A
 */
public class Menu {

    static Enum Command() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Command {
        START, SAVE_GAME, LOAD_GAME, HIGH_SCORES, QUIT;
    }

    public static void getAllCommands() {
        /*Menu[] command = Menu.values();
        for (int i = 0; i < Command.length; i++) {

            System.out.println(value);
        }*/
    }

    public static void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando:");
        String line = scanner.nextLine();
        Command command = Command.valueOf(line);
        
        if(command == Command.START){
            // start
        }
        else if(command == Command.SAVE_GAME){
            // save game
        }
        else if(command == Command.LOAD_GAME){
            // load game
        }
        else if(command == Command.HIGH_SCORES){
            // high scores
        }
        else if(command == Command.QUIT){
            // quit
        }
        
        switch (command) {
            case START:
                System.out.println("Start");
                break;
            case SAVE_GAME:
                System.out.println("SAVE GAME");
                break;
            case LOAD_GAME:
                System.out.println("LOAD GAME");
                break;
            case HIGH_SCORES:
                System.out.println("HIGH SCORES");
                break;
            case QUIT:
                System.out.println("QUIT");
                break;
            default:
                System.out.println("default");
        }
    }
}
