//Duplicate Word Filter:**
//   - **Problem Statement:** Create a program that reads a list of words and filters out the duplicates, ensuring that each word in the final list is unique. Implement functionality to add words from a list, remove a word, check for the existence of a word, and display all unique words.
//   - **Tasks:**
//     1. Add words from a list to the collection.
//     2. Check if a specific word exists in the collection.
//     3. Remove a word from the collection.
//     4. Display all unique words.
package Duplicate_Word_Filter;

import Duplicate_Word_Filter.data.Words;
import Duplicate_Word_Filter.data.WordsManager;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordsManager   wordsManager=new WordsManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Duplicate Words Filter ******************");
//this will create Word class object and passes to HashSet
        Words word= new Words("shubham");
        wordsManager.addWords(word);
        Words word1= new Words("rahul");
        wordsManager.addWords(word1);
        wordsManager.addWords(word);// this will get rejected because it is not unique
        Words word2= new Words("komal");
        wordsManager.addWords(word2);
        Words word3= new Words("pooja");
        wordsManager.addWords(word3);
        // this will search for the words
        wordsManager.checkWords("kumar");

        //this will remove word
        wordsManager.removeWords("rahul");

        //Displaying unique words
        wordsManager.displayWords();
    }
}
