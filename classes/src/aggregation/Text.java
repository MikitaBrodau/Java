package aggregation;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Text {
    String head;
    List<Clause> clause;

    public Text(String head, List<Clause> clause) {
        this.head = head;
        this.clause = clause;
    }

    public void addSmthInText(String word, int clauseNum) {
        this.clause.get(clauseNum).addInClause(word);
    }

    static class Clause {
        List<Word> words = new ArrayList<>();

        public Clause(List<Word> clause) {
            words.addAll(clause);
        }

        private String getClause(){
            return words.toString();
        }

        private String clause(){
            StringBuilder sb = new StringBuilder();
            words.forEach(Word -> sb.append(Word.toString()));
            return sb.toString();
        }

        public void addInClause(String word){
            this.words.add(new Word(word));
        }

        @Override
        public String toString() {
            return clause();
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
    private String hr(){
        StringBuilder sb = new StringBuilder();
        for (Clause cl :clause) {
            sb.append(cl.toString());
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        return hr();
    }
}




