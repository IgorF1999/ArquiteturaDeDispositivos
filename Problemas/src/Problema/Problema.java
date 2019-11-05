/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema;

/**
 *
 * @author Turma A
 */
public class Problema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
            {15, 18, 17},
            {18, 10, 11}, // grades of student 30312
            {11, 13, 15},
            {10, 19, 16}
        };
        float media = 0;
        float average = 0;
        String str = null;
        for (int i = 0; i < studentNumbers.length; i++) {
            str = "O aluno " + studentNumbers[i] + " teve ";
            for (int j = 0; j < courseAcronyms.length; j++) {
                str += studentGrades[i][j] + " a " + courseAcronyms[j];
                if (j == courseAcronyms.length - 1) {
                    str += ".";
                } else {
                    str += ", ";
                }
                media += studentGrades[i][j];
            }
            average = media / courseAcronyms.length;
            System.out.println(str + " Este aluno teve media de: " + average);
            media = 0;
        }
        final int[][] identityMatrix = {
            {1, 0, 0},
            {0, 1, 0}, // grades of student 30312
            {0, 0, 1}
        };
        /*
        PrintGrades(studentNumbers, courseAcronyms, studentGrades);

        boolean isMatrix = MatrixUtilities.isMatrix();
        System.out.println("Is Matrix?:" + isMatrix);
        boolean.isIdentity = MatrixUtilities.isIdentity
        System.out.println("Is Identity?:" + isIdentity);
        */
    }

}
