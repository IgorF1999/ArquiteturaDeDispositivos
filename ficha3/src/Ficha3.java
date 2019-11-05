/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Ficha3 {
    public static void main(String[] args) {
        char x = 'a';
        int steps = 3;
        char [] array = {'a', 'a', 'c', 'd'};
        char [] array2 = {'e', 'f', 'g'};
        char newChar = 'f';
        char seguinte = CharacterUtilities.lowerLetterSuccessorOf(x);
        System.out.println(seguinte);
        char anterior = CharacterUtilities.lowerLetterPredecessorOf(x);
        System.out.println(anterior);
        char c = CharacterUtilities.lowerLetterSuccessorStepsOf(x, steps);
        System.out.println(c);
        char d = CharacterUtilities.lowerLetterPredecessorStepsOf(x, steps);
        System.out.println(d);
        int conta = CharacterUtilities.occurrencesOfCharacterIn(x, array);
        System.out.println(conta);
        //char[] replace = CharacterUtilities.replaceCharacterIn(array, x, newChar);
        //System.out.println(replace);
        char[] concatena = CharacterUtilities.concatenationOf(array, array2);
        System.out.println(concatena);
        
    } 
}
