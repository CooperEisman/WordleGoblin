// Author:      Cooper Eisman
// Created:     2259 20MAR22
// Modified:    2259 20MAR22
// Purpose:     Manages currenty available words

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class WordManager {
    private File file;
    private Scanner reader;
    private ArrayList<String> words;

    //Creates New Instance, Fills Arrays
    public WordManager() {
        try {
            file = new File("src/validwords.txt");
            reader = new Scanner(file);
            words = new ArrayList<String>();

            while (reader.hasNextLine()) {
                words.add(reader.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation Failed, File Not Found");
        }
    }

    public String getWord(int index) {
        return words.get(index);
    }
}

