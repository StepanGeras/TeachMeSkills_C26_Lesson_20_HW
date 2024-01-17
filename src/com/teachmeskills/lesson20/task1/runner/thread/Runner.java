package com.teachmeskills.lesson20.task1.runner.thread;

import com.teachmeskills.lesson20.task1.class_morning.thread_morning.MorningThread;
import com.teachmeskills.lesson20.task1.reading_file.ReadingFile;

import static com.teachmeskills.lesson20.task1.constant.Constant.*;

/**
 * Задача 1
 * 	1. Cоздать программу, иммитирующую утро: чтение нововостей, завтра, кофе.
 * 	Каждому потоку задать имя и приоритет из конфиг файла.
 * 	Пусть будет 3 потока.
 * 	Создать и запустить 3 потока.
 * 	Используя класс Thread.
 */

public class Runner {

    public static void main(String[] args){

        MorningThread breakfast = new MorningThread("Breakfast");
        MorningThread readingNews = new MorningThread("Reading news");
        MorningThread coffee = new MorningThread("Coffee");

        ReadingFile.doReadingFile();

        breakfast.setPriority(BREAKFAST_PRIORITY);
        readingNews.setPriority(READING_NEWS_PRIORITY);
        coffee.setPriority(COFFEE_PRIORITY);

        breakfast.start();
        readingNews.start();
        coffee.start();

    }

}
