// Author:      Cooper Eisman
// Created:     2209 20MAR22
// Modified:    2210 20MAR22
// Purpose:     Manager for game features

public class WordleGame {
    //Game is the primary tracker of status of the game's state
    private WordleLine[] game;
    //Current Line is the line the game is on.
    private int currentLine;

    //Default Constructor, No Args, Initializes Instance.
    public WordleGame() {
        game = new WordleLine[6];
        currentLine = 0;
    }

    //Adds a line to the game; Returns if game has ended
    public boolean addLine(String guess, String result) {
        game[currentLine] = new WordleLine(guess,result);
        currentLine++;

        if(currentLine > 5 || result.equals("GGGGG")) {
            return true;
        }

        return false;
    }
}

//Manages one line of the game only. For use in WordleGame
class WordleLine {
    private String guess;
    private String result;

    public WordleLine(String guess, String result) {
        this.guess = guess;
        this.result = result;
    }
}
