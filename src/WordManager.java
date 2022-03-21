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
        words = new ArrayList<String>();

        try {
            file = new File("src/validwords.txt");
            reader = new Scanner(file);

            while (reader.hasNextLine()) {
                words.add(reader.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation Failed, File Not Found");
        }
    }

    //Eliminates Words based on data, Return amount of words eliminated
    public int calculate(char[][] data) {
        int count = 0;
        ArrayList<String> temp = new ArrayList<String>();

        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < 6; j++) {
                if (data[j][i] == '0') {
                   for (String s : words) {
                       if (s.charAt(i) != data[0][i]) {
                           temp.add(s);
                       } else {
                           count++;
                       }
                   }
                } else if (data[j][i] == '2') {
                    for (String s : words) {
                        if (s.charAt(i) == data[0][i]) {
                            temp.add(s);
                        } else {
                            count++;
                        }
                    }
                }
            }
        }
    }
}

