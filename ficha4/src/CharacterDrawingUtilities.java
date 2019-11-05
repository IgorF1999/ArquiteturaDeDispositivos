/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class CharacterDrawingUtilities {

    static void drawElement(char carater) {
        System.out.print(carater);
    }

    static void drawNewLine() {
        System.out.print("");
    }

    static void drawHorizontalSegmentWith(char carater, int n) {
        for (int i = 0; i < n; i++) {
            drawElement(carater);
        }
    }

    static void drawFilledRectangleWith(char carater, int altura, int comprimento) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < comprimento; j++) {
                drawElement(carater);
            }
            drawNewLine();
        }
    }

    static void drawEmptyRectangleWith(char carater, int altura, int comprimento) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < comprimento; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == comprimento-1) {
                    drawElement(carater);
                } else {
                    drawElement(' ');
                }
            }
            drawNewLine();
        }
    }
}
