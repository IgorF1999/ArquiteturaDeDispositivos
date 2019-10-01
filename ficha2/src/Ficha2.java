/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Ficha2 {
       
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String str = ArrayUtilities.toString(array);
        System.out.println(str);
        int max = ArrayUtilities.maximumOf(array);
        System.out.println(max);
        int min = ArrayUtilities.minimumOf(array);
        System.out.println(min);
        int copy = ArrayUtilities.copyOf(array);
        System.out.println(copy);
    }
}
