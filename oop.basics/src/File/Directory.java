package File;

import java.util.ArrayList;
import java.util.List;

class Directory {
    private List<File> filesIn = new ArrayList<>();
    private String name;

    public Directory(String name) {
        this.name = name;
        java.io.File file = new java.io.File(name);
        file.mkdir();
    }

    public List<File> getFilesIn() {
        return filesIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
