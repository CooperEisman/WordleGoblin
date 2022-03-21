// Author:      Cooper Eisman
// Created:     2209 20MAR22
// Modified:    2230 20MAR22
// Purpose:     Manager for game features

import java.util.Arrays;

public class WordleGame {
    //Row 0 is Letter, Row 1->5 is Value in Array. 0 = Not Here, 1 = Maybe Here, 2 = Here
    private char[][] letters;
    private final String LETTER_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    //Default Constructor, No Args, Initializes Instance.
    public WordleGame() {
        letters = new char[6][26];
        letters[0] = LETTER_STRING.toCharArray();

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 26; j++) {
                letters[i][j] = '1';
            }
        }
    }

    //Adds a Line to the Game
    public void addLine(String guess, String result) {
        for (int x = 0; x < guess.length(); x++) {
            int letterIndex = LETTER_STRING.indexOf(guess.charAt(x));

            //Grey Inputs Turn all Arr to O
            if (result.charAt(x) == 'R') {
                for (int y = 1; y <= 6; y++) {
                    letters[y][letterIndex] = '0';
                }
            }

            //Yellow Input At Index Removes Current, Adds Rest
            else if (result.charAt(x) == 'Y') {
                letters[x+1][letterIndex] = '0';

                for (int y = 0; y <= 5; y++) {
                    if (!(letters[y][letterIndex] == '0') && !(letters[y][letterIndex] == '2')){
                        letters[y][letterIndex] = '1';
                    }
                }

            }

            //Green Input Adds a 1 in the place
            else if (result.charAt(x) == 'G') {
                letters[x+1][letterIndex] = '2';
            }
        }
    }

    //Get Values as Generated Here
    public char[][] getLetters() {
        return letters;
    }

    //Recalculates Arrays of Letters
    private void calculate() {

    }
}
