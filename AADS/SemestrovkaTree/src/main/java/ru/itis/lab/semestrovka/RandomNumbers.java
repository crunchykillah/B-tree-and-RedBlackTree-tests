package ru.itis.lab.semestrovka;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RandomNumbers {
    File file = new File("input.txt");

    public File getFile() {
        return file;
    }

    public void randomizer(String name) throws IOException {
        String x = "";
        int count = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        for (int i = 0; i < 10000; i++) {
            x = String.valueOf((int) (Math.random()  * 1310 * Math.random())  + ",");
            fileOutputStream.write(x.getBytes());
        }
    }
    public int[] StringArrToIntArr(String[] arr, int length){
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        return numbers;
    }

}