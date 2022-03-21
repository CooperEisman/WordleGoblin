// Author:      Cooper Eisman
// Created:     2259 20MAR22
// Modified:    2352 20MAR22
// Purpose:     Manages currenty available words

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Locale;
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
                words.add(reader.next().toUpperCase(Locale.ROOT));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Operation Failed, File Not Found");
        }
    }

    //Eliminates Words based on data, Return amount of words eliminated
    public int calculate(char[][] data) {
        ArrayList<String> temp = new ArrayList<String>(words);

        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < 6; j++) {
                if (data[j][i] == '0') {
                   for (String s : words) {
                       if (s.charAt(j-1) == data[0][i]) {
                           temp.remove(s);
                       }
                   }
                } else if (data[j][i] == '2') {
                    for (String s : words) {
                        if (s.charAt(j-1) != data[0][i]) {
                            temp.remove(s);
                        }
                    }
                }
            }
        }

        int count = words.size() - temp.size();
        words = temp;
        return count;
    }

    public String[] availableWords() {

        Object[] a =  words.toArray();
        String[] b = new String[a.length];
        int i = 0;

        for (Object obj : a) {
            b[i] = obj + "";
            i++;
        }
        return b;
    }
}

