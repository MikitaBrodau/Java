package File;


public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("./oop.basics/src/File/GodDamn");
        dir.getFilesIn().add(new File("God", ".json"));
        dir.getFilesIn().get(0).setDirectory(dir);
        dir.getFilesIn().get(0).setContent("Hello Jesus");
        dir.getFilesIn().get(0).getContent();
        dir.getFilesIn().add(new TextFile("AnotherGod"));
        dir.getFilesIn().get(1).setDirectory(dir);
        dir.getFilesIn().get(1).setContent("IM A GOD\nDon't tell to Kratos about it.");
        dir.getFilesIn().get(1).addContent("\nHALLO");
        dir.getFilesIn().get(1).getContent();
        System.out.println(dir.getFilesIn().get(1).getExtension());
        dir.getFilesIn().get(0).delete();
        dir.getFilesIn().get(1).setName("Jerotajhoeirt");

    }
}
