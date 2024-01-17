package com.teachmeskills.lesson20.task1.reading_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static com.teachmeskills.lesson20.task1.constant.Constant.*;

public class ReadingFile {

    public static void doReadingFile () {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the path config");

            String path = scanner.nextLine();

            List<String> listPriority = Files.readAllLines(Paths.get(path));

            for (String string: listPriority) {

                List<String> listString = List.of(string.split(" "));

                if (string.toLowerCase().contains("coffee")) {

                    COFFEE_PRIORITY += listString
                            .stream()
                            .filter(x -> x.matches(REGULAR_EXPRESSION))
                            .collect(Collectors.averagingInt(Integer::parseInt));

                } else if (string.toLowerCase().contains("breakfast")) {

                    BREAKFAST_PRIORITY += listString
                            .stream()
                            .filter(x -> x.matches(REGULAR_EXPRESSION))
                            .collect(Collectors.averagingInt(Integer::parseInt));

                } else if (string.toLowerCase().contains("reading new")) {

                    READING_NEWS_PRIORITY += listString
                            .stream()
                            .filter(x -> x.matches(REGULAR_EXPRESSION))
                            .collect(Collectors.averagingInt(Integer::parseInt));

                }

            }

        } catch (IOException e) {
            System.out.println("Error read file");
        }

    }

}
