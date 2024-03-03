package com.mashibing.juc.c_001;

import static java.lang.Thread.sleep;

public class CreateThreadMethodByImplementsRunnable {

    static class DemoImplementsRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i < 11; i++) {
                try {
                    sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }


    public static void main(String[] args){
        Thread thread = new Thread(new DemoImplementsRunnable());
        thread.start();
        for (int i = 1; i < 11; i++) {
            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ ":" + i);
        }
    }
}
