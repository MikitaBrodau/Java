package aggregation;

import java.util.List;

public class Text {
    List<Clause> clause;

    public Text(List<Clause> clause) {
        this.clause = clause;
    }
    public void addSmthInText(Word word, int clauseNum){
        Clause words = clause.get(clauseNum);
        words.words.add(word);
        clause.set(clauseNum, words);
    }

    @Override
    public String toString() {
        return clause.toString().toLowerCase();
    }
}

class Clause {
    List<Word> words;

    public Clause(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return words.toString();
    }
}

class Word {
    String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
