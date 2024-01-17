package com.teachmeskills.lesson20.task1.runner.runnable;

import com.teachmeskills.lesson20.task1.class_morning.runnable_morning.MorningRunnable;
import com.teachmeskills.lesson20.task1.reading_file.ReadingFile;
import static com.teachmeskills.lesson20.task1.constant.Constant.*;

/**
 * Задача 1
 * 	1. Cоздать программу, иммитирующую утро: чтение нововостей, завтра, кофе.
 * 	Каждому потоку задать имя и приоритет из конфиг файла.
 * 	Пусть будет 3 потока.
 * 	Создать и запустить 3 потока.
 * 	Сделать два варианта: используя интерфейс Runnable.
 */

public class Runner {

    public static void main(String[] args) {

        ReadingFile.doReadingFile();

        Runnable breakfast = new MorningRunnable("Breakfast", BREAKFAST_PRIORITY);
        Runnable readingNews = new MorningRunnable("Reading news", READING_NEWS_PRIORITY);
        Runnable coffee = new MorningRunnable("Coffee", COFFEE_PRIORITY);

    }

}
