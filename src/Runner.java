// Author:      Cooper Eisman
// Created:     2359 20MAR22
// Modified:    0021 21MAR22
// Purpose:     Coordinates Game and Word Managers

import java.util.Locale;

public class Runner {
    private WordleGame w = new WordleGame();
    private WordManager x = new WordManager();

    public Runner() {}

    //Adds a new line, returns metrics
    public String add(String text, String result) {
        w.addLine(text.toUpperCase(Locale.ROOT),result.toUpperCase(Locale.ROOT));
        System.out.println(w.getLetters()[2][0]);
        int c = x.calculate(w.getLetters());
        return "Removed " + c + "/12972 words (" + (String.valueOf(c/129.7200000001).substring(0,5)) + "%)";
    }


}
