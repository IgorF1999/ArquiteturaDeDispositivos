/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class CharacterUtilities {
    static char lowerLetterSuccessorOf(char x) {
        if (x == 'z'){
            return 'a';
        }
        else {
            x++;
        }
        return x;
    }

    static char lowerLetterPredecessorOf(char x) {
        if (x == 'a'){
            return 'z';
        }
        else {
            x--;
        }
        return x;
    }

    static char lowerLetterSuccessorStepsOf(char x, int steps) {   
        for (int i = 0; i < steps; i++) {            
            if(x == 'z'){
                x = 'a' - 1;
            } //else {
              //  c++   outra forma de resolver
            //}       
            x++;
        }
        return x;
    }

    static char lowerLetterPredecessorStepsOf(char x, int steps) {
        for (int i = 0; i < steps; i++) {            
            if(x == 'a'){
                x = 'z' + 1;
            } //else {
              //  d--   outra forma de resolver
            //}
            x--;
        }
        return x;
    }

    static int occurrencesOfCharacterIn(char x, char[] array) {
        int conta = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]){
               conta ++;
            } 
        }
        return conta;
    }
    static void replaceCharacterIn(char[] array, char x, char newChar) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                array[i] = newChar;
            }
        }
    }

    static char[] concatenationOf(char[] array, char[] array2) {
        char[] c = new char[array.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            c[i] = array[i];
        }
        for (int j = 0; j < array2.length; j++) {
            c[j + array.length] = array2[j]; 
        }
        return c;
    }
    static char[] copyOfPartOf(char[]array, int i1, int i2){
        char[] result = new char[i2-i1+1];
        for (int i = i1; i < i2; i++) {
            
        }
        return result;
    }
}
