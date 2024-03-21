package data_annotation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DataAnnotation {
    public static void main(String[] args) throws IOException {
        System.out.println(decode("message2.txt"));
    }

    private static String decode(String fileName) throws IOException {
        TreeMap<Integer, String> map = Files.readAllLines(Path.of(DataAnnotation.class.getResource(fileName).getPath()))
                .stream()
                .map(line -> line.split(" "))
                .collect(Collectors.toMap(
                        arr -> Integer.parseInt(arr[0]),
                        arr -> arr[1],
                        (a, b) -> a,
                        TreeMap::new)
                );
        ArrayList<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        StringBuilder decodedValue = new StringBuilder();
        int level = 1;
        int index = 0;
        while (index + level - 1 < entries.size()) {
            decodedValue.append(entries.get(index + level - 1).getValue()).append(" ");
            index = index + level;
            level++;
        }
        decodedValue.deleteCharAt(decodedValue.length() - 1);
        return decodedValue.toString();
    }

    private static TreeMap<Integer, String> readFile(Path filePath) throws IOException {
        return Files.readAllLines(filePath)
                .stream()
                .map(line -> line.split(" "))
                .sorted(Comparator.comparing(arr -> arr[0]))
                .collect(Collectors.toMap(
                        arr -> Integer.parseInt(arr[0]),
                        arr -> arr[1],
                        (a, b) -> a,
                        TreeMap::new)
                );
    }
}