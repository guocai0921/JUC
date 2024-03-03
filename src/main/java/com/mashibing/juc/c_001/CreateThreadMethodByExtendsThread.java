package com.mashibing.juc.c_001;

import static java.lang.Thread.sleep;

public class CreateThreadMethodByExtendsThread {

    static class DemoExtendThread extends Thread {
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


    public static void main(String[] args) {
        DemoExtendThread thread = new DemoExtendThread();
        thread.start();
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
