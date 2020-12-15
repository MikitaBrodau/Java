package File;

class TextFile extends File {
    private final String txtExtension = ".txt";
    private String content;

    public TextFile(String name) {
        super(name);
        setExtension(txtExtension);
    }

    public TextFile(String name, String content) {
        super(name);
        setExtension(txtExtension);
        this.content = content;
    }

    public String getTxtExtension() {
        return txtExtension;
    }
}