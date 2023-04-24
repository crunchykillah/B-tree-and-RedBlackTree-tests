package ru.itis.lab.semestrovka;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BinaryTree tree = new BinaryTree();
        RandomNumbers rand = new RandomNumbers();
        Scanner sc = new Scanner(rand.getFile());
        DataWriter dw = new DataWriter();
        int numberTimeAdd = 0;
        int numberCountAdd = 0;
        int numberTimeContains = 0;
        int numberCountContains = 0;
        int numberTimeDelete = 0;
        int numberCountDelete = 0;
        rand.randomizer("input.txt");
        String[] numbersString = sc.nextLine().split(",");
        int[] numbers = rand.StringArrToIntArr(numbersString, numbersString.length);
        for (int number : numbers) {
            long start = System.nanoTime();
            tree.add(number);
            long time = System.nanoTime() - start;
            numberTimeAdd += time;
            numberCountAdd += tree.getAddCount();
            dw.dataWrite("outputAdd.txt", tree.getAddCount(),time);
        }
        System.out.println("Среднее время добавления: " + (numberTimeAdd/10000));
        System.out.println("Среднее количество операций добавления: " + (numberCountAdd/10000));
        for (int i = 0; i < 100; i++) {
            int num = numbers[(int) (Math.random() * 10000)];
            long start = System.nanoTime();
            long time = 0;
            if (tree.containsNode(num)) {
                time = System.nanoTime() - start;
            }
            numberTimeContains += time;
            numberCountContains += tree.getContainsCount();
            dw.dataWrite("outputContains.txt", tree.getContainsCount(), time);
        }
        System.out.println("Среднее время поиска: " + (numberTimeContains/100));
        System.out.println("Среднее количество операций поиска: " + (numberCountContains/100));
        for (int i = 0; i < 1000; i++) {
            int num = numbers[(int) (Math.random()*10000)];
            long start = System.nanoTime();
            tree.delete(num);
            long time = System.nanoTime() - start;
            numberTimeDelete += time;
            numberCountDelete += tree.getDeleteCount();
            dw.dataWrite("outputDelete.txt", tree.getDeleteCount(), time);
            if (tree.containsNode(num)) {
                System.out.println("Удаление не удалось");
            }
        }
        System.out.println("Среднее время удаленияя: " + (numberTimeDelete/1000));
        System.out.println("Среднее количество операций удаления: " + (numberCountDelete/1000));
    }
}
