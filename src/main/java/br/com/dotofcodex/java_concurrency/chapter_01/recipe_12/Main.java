package br.com.dotofcodex.java_concurrency.chapter_01.recipe_12;

public class Main {
    public static void main(String[] args) {
        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();

        Thread thread = null;
        System.out.printf("Starting the Threads%n");

        for (int i = 0; i < 10; i++) {
            thread = factory.newThread(task);
            thread.start();
        }

        System.out.printf("Factory stats:%n");
        System.out.printf("%s%n",factory.getStatistics());
    }
}
