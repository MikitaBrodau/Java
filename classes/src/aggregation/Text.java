package aggregation;

public class Text {
    String text;

    public Text(Clause clause, Word word) {
        this.text = clause.toString() + " " + word.toString();
    }

    @Override
    public String toString() {
        return text.toLowerCase();
    }
}

class Clause {
    String clause;

    public Clause(String clause) {
        this.clause = clause;
    }

    @Override
    public String toString() {
        return clause;
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
