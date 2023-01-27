package org.example;

public class While {
    public static void main(String[] args) {
        int countDown = 10;

        while (countDown >= 0) {
            System.out.println("До старта: " + countDown);
            countDown --;
        }

        System.out.println("Поехали !");

    }
}
