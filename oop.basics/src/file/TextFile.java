package file;

import java.io.*;
import java.nio.file.Paths;

/*Создать объект класса Текстовый файл, используя классы Файл,
Директория. Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.*/
class TextFile {
    private String name;
    private final String txtExtension = ".txt";
    private String path;

    public TextFile(String name, String path) {
        this.name = name;
        this.path = path;
        File file = new File(Paths.get(path) + "\\" + name.concat(txtExtension));
        createFile(file);
    }

    private void createFile(File file) {
        try {
            if (!file.isDirectory()) {
                if (file.createNewFile()) {
                    System.out.println("successfully created");
                } else if (file.exists()) System.out.println("already exist");
            } else file.mkdir();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rename(String name) {
        File file = new File(Paths.get(this.path) + "\\" + this.name.concat(txtExtension));
        boolean success = file.renameTo(new File(Paths.get(this.path) + "\\" + name.concat(txtExtension)));
        this.name = name;
        if (!success) {
            System.out.println("fail to rename");
        } else System.out.println("Successfully renamed. new filename: " + name);
    }

    public void getContent() {
        try (BufferedReader br = new BufferedReader(new FileReader(Paths.get(this.path) + "\\" + this.name.concat(txtExtension)))) {
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addContent(String content) {
        try (FileWriter write = new FileWriter(new File(Paths.get(this.path) + "\\" + this.name.concat(txtExtension))
                , true)) {
            write.append(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        java.io.File file = new java.io.File(Paths.get(this.path) + "\\" + this.name.concat(txtExtension));
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }


    public static void main(String[] args) {
        TextFile file = new TextFile("Ololo.23", "C:\\Users\\User\\Upskill\\resources");
        file.rename("God_bless_you");
        file.addContent("r u k?");
        file.getContent();
        file.delete();
    }
}