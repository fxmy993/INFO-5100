package edu.northeastern.fxmy;

public class Main {

    public static void main(String[] args) {

        Psychiatrist psychiatrist = new Psychiatrist();
        Moody sad = new Sad();
        Moody happy = new Happy();

        psychiatrist.examine(sad);
        psychiatrist.observe(sad);
        psychiatrist.examine(happy);
        psychiatrist.observe(happy);
    }
}
