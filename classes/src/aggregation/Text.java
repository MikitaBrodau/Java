package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Text {
    List<Clause> clause;

    public Text(List<Clause> clause) {
        this.clause = clause;
    }

    public void addSmthInText(Word word, int clauseNum) {
        Clause words = clause.get(clauseNum);
        words.words.add(word);
        clause.set(clauseNum, words);
    }

    static class Clause {
        List<Word> words = new ArrayList<>();

        public Clause(List<Word> clause) {
            words.addAll(clause);
        }

        private String getClause(){
            return words.toString();
        }

        @Override
        public String toString() {
            return words.toString();
        }
    }

    static class Word {
        String word;

        public Word(String word) {
            this.word = word;
        }

        @Override
        public String toString() {
            return word;
        }
    }

    @Override
    public String toString() {
        return clause.toString().toLowerCase();
    }
}




