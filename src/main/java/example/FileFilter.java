package example;

import java.io.File;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by relango on 3/24/2014.
 */
public class FileFilter {
    public static void main(String[] args) {

        //Print sub dirs
        File[] subDirs = Paths.get(".").toFile().listFiles(child -> child.isDirectory());
        Stream.of(subDirs).forEach(System.out::println);

        //File with extension
        String[] fileNames = Paths.get(".").toFile().list((dir, name) -> name.endsWith(".xml"));
        Stream.of(fileNames).forEach(System.out::println);
    }
}
