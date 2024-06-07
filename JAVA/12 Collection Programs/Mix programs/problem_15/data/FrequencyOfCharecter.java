package problem_15.data;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharecter {
    private String input_string;

    HashMap<String, Integer> char_freq = new HashMap<>();

    //setter method
    public void setInput_string(String input_string)
    {
        this.input_string = input_string;
    }

    //method for counting frequency
    public void charecterFrequency() {
        //string array for word
        String[] str_word=input_string.split(" ");
        //string array for each charecter in word
        String[] chr;


        for (int i = 0; i < str_word.length; i++) {

            chr=str_word[i].split("");

            for (String s : chr)
            {
                if (char_freq.containsKey(s)){

                    char_freq.put(s,char_freq.get(s)+1);
                }
                else {
                    char_freq.put(s,1);
                }
            }


        }
    }


    public void displayCharFreq() {
        for (Map.Entry f : char_freq.entrySet()) {
            System.out.println(f);
        }
    }
}

