// Author:      Cooper Eisman
// Created:     2359 20MAR22
// Modified:    0021 21MAR22
// Purpose:     Coordinates Game and Word Managers

import java.util.Locale;

public class Runner {
    private WordleGame w = new WordleGame();
    private WordManager x = new WordManager();
    private ProbabilityManager p = new ProbabilityManager(x.availableWords());
    private double remaining;
    private double original;

    public Runner() {
        remaining = 12972.0;
        original = 12972.0;

    }

    //Adds a new line, returns metrics
    public String add(String text, String result) {
        w.addLine(text.toUpperCase(Locale.ROOT),result.toUpperCase(Locale.ROOT));
        int c = x.calculate(w.getLetters());
        remaining -= c;
        p = new ProbabilityManager(x.availableWords());
        System.out.println(p.calculate());
        return "Removed " + c + "/12972 words (" + (String.valueOf(100.0 * (original - remaining)/(original)).substring(0,5)) + "%)";
    }


}
