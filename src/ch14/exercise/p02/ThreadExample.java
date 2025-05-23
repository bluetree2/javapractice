package ch14.exercise.p02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        Thread musicThread = new Thread(
                new MusicRunnable()
        );
        musicThread.start();

    }
}
