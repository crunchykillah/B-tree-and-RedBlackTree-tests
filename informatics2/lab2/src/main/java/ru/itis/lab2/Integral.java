package ru.itis.lab2;

import java.util.Scanner;

public class Integral {
    int tCount;
    double summ = 0;
    double partSize;

    public static void main(String[] args) {
        Integral integral = new Integral();
        double s = integral.calculateIntegralThread();
        System.out.println("integral: " + s);
    }

    private double calculateIntegralThread() {
        tCount = Runtime.getRuntime().availableProcessors() - 2;
        Thread[] threads = new Thread[tCount];
        partSize = 0.001;
        System.out.println("шаг: " + partSize);
        for (int k = 0; k < tCount; ++k) {
            threads[k] = new Thread(new PartSumm(k));
            threads[k].start();
        }
        for(int k = 0; k < tCount; ++k) {
            try {
                threads[k].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return summ;
    }
    private class PartSumm implements Runnable {
        long[] array;
        int k;
        public PartSumm(int k) {
            this.k = k;
        }
        public Double f(double x){
            double fx = (x * x) * Math.exp(x);
            return fx;
        }

        @Override
        public void run() {

            double g = 0;

            double st = 0.1 * k;

            double se = 0.1 * (k + 1);

            for (double i = st; i <= se; i += 0.001 ) {
                g = f(i) + f(i + 0.001);
                addSumm((g/2)*partSize);
            }
        }
        public synchronized void addSumm(double g) {
            summ += g;
        }
    }

}
