//### Problem 10: Case-Insensitive Dictionary
//**Objective:** Implement a case-insensitive dictionary.
//
//**Requirements:**
//- Use `TreeMap` with a custom comparator for case-insensitive keys.
//- Store word definitions with case-insensitive words as keys.
//- Allow adding, updating, deleting, and retrieving word definitions.
//- Display all dictionary entries in case-insensitive sorted order.
package problem_10;

import problem_10.data.WordDictionary;

public class Main {
    public static void main(String[] args) {


        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("aspersion","wordy attack");
        wordDictionary.addWord("Devolved","transfered to lower level");
        wordDictionary.addWord("erring","culpable");
        wordDictionary.addWord("evanesced","disappeared");
        wordDictionary.addWord("meticulous","carefully");
        wordDictionary.addWord("stifled","to be silenced");
        wordDictionary.display();
        wordDictionary.removeWord("erring");
        wordDictionary.updateWord("aspersion","attack over an issue");
        wordDictionary.display();
    }
}
