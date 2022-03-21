// Author:      Cooper Eisman
// Created:     2209 20MAR22
// Modified:    2230 20MAR22
// Purpose:     Manager for game features

public class WordleGame {
    //Row 0 is Letter, Row 1->5 is Value in Array. -1 = Not Here, 0 = Maybe Here, 1 = Here
    private char[][] letters;


    //Default Constructor, No Args, Initializes Instance.
    public WordleGame() {
        letters = new char[6][26];
        letters[0] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 26; j++) {
                letters[i][j] = '0';
            }
        }
    }

    //Adds a line to the game; Returns if game has ended
    public boolean addLine(String guess, String result) {
        return false;
    }

    //Recalculates Arrays of Letters
    private void calculate() {

    }
}
