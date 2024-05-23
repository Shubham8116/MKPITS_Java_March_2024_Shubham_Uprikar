package Duplicate_Word_Filter.data;

import java.util.*;

public class WordsManager {
    int count=0;
    Iterator iterator;
    Words word;
    HashSet<Words> hashSet=new HashSet();

    public void addWords(Words word)
    {
        hashSet.add(word);
        System.out.println("Word added successfully !");

    }
    public void checkWords(String check)
    {

        count=0;
        iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            word=(Words)iterator.next();
            if(word.getWords().equalsIgnoreCase(check))
            {
                System.out.println("word found successfully");
                count++;
            }
        }
        if (count==0)
            System.out.println("Sorry no records found with the given word");
    }
    public void removeWords(String remove)
    {
        count=0;
        iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            word=(Words)iterator.next();
            if(word.getWords().equalsIgnoreCase(remove))
            {
                hashSet.remove(word);
                System.out.println("word removed successfully");
                count++;
                return;
            }
        }
        if (count==0)
            System.out.println("Sorry no records found with the given word");
    }
    public void displayWords()
    {
        System.out.println("All words as follows : ");
        iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            word=(Words)iterator.next();
            System.out.println(word.getWords());

        }
    }
}
