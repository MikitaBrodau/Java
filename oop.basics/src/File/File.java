package File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/

public class File {
    private String name;
    private String extension;
    private Directory directory;

    public File(String name, String extension) {
        this.name = name;
        this.extension = extension;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        java.io.File file = new java.io.File("./" + directory.getName() + "/" + this.name + extension);
        boolean success = file.renameTo(new java.io.File("./" + directory.getName() + "/" + name + extension));
        if (!success) {
            System.out.println("fail to rename");
        } else System.out.println("Successfully renamed. new filename: " + name + extension);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void getContent() {
        try (BufferedReader br = new BufferedReader(new FileReader("./" + directory.getName() + "/" + name + extension))) {
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setContent(String content) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter("./" + directory.getName() + "/" + name + extension))) {
            write.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addContent(String content) {
        try (FileWriter write = new FileWriter(new java.io.File("./" + directory.getName() + "/" + name + extension), true)) {
            write.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        java.io.File file = new java.io.File(directory.getName() + "/" + name + extension);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

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
