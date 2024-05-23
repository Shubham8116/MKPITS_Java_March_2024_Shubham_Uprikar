package Duplicate_Word_Filter.data;

public class Words {
    String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Words(String words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Words{" +
                "words='" + words + '\'' +
                '}';
    }
}
