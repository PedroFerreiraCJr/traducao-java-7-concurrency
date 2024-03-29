package br.com.dotofcodex.java_concurrency.chapter_01.recipe_11;

public class Main {
    public static void main(String[] args) {
        MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
        Task task = new Task();

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(threadGroup, task);
            t.start();
        }
    }
}
