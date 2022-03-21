// Author:      Cooper Eisman
// Created:     2207 20MAR22
// Modified:    2208 20MAR22
// Purpose:     Main Runner for Wordle Goblin App

public class main {
    public static void main(String[] args) {
        WordleGame w = new WordleGame();
        WordManager x = new WordManager();

        w.addLine("ADIEU","YRRRR");

        System.out.print(x.calculate(w.getLetters()));

    }
}
