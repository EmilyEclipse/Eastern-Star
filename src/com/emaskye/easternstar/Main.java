package com.emaskye.easternstar;

import java.util.*;



public class Main {
    public static boolean decide () {
        Scanner reader = new Scanner(System.in);
        Random RNG = new Random();
        String input = reader.nextLine();
        input = input.toLowerCase();
        switch (input) {
            case "go fight":
                while (!enemyDefeated) {
                    fightingSequence();
                }
            default:
                System.out.println("Can't do that, B0$$");
        }
    }

    public static boolean fightingSequence (Scanner input, Random RNG) {
        //fighting decision tree
        switch (input) {
            case "fight" -> System.out.println(spider.getDescription());
            case "block" -> System.out.println("Can't do that yet.");
            case "use", "use item" -> System.out.println("Can't do that yet.");
            default -> System.out.println("Can't do that, B0$$");
        }
    }

    public static void main(String[] args) {
        Spider spider = new Spider("Spider",100);

        List<Enemy> enemyList = new ArrayList<Enemy>(Arrays.asList(
                spider
            )
        );

        while(!gameOver){
            decide();
        }
    }
}
