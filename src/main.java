// Author:      Cooper Eisman
// Created:     2207 20MAR22
// Modified:    2208 20MAR22
// Purpose:     Main Runner for Wordle Goblin App

public class main {
    public static void main(String[] args) {
        WordleGame w = new WordleGame();

        w.addLine("HALLO","YYRRR");

        for (int i = 0; i < 6; i++) {
            System.out.print(w.getLetters()[i][0]);
        }

    }
}
