package com.emaskye.easternstar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Enemy extends Entity{
    //FIELDS
    private String description;
    private String name;

    //CONSTRUCTORS
    public Enemy (String name, int health) {
        super(health);
        this.name = name;
        description = readDescription(name);
    }

    //FUNCTIONS

    public String getDescription() {
        return this.description;
    }


    private static String readDescription(String enemyName) {
        try {
            File descriptionPath = new File("./Resources/Descriptions/" + enemyName + ".txt");
            Scanner fileReader = new Scanner(descriptionPath);
            String fileContents = "";

            while(fileReader.hasNextLine()) {
                fileContents = fileContents.concat(fileReader.nextLine());
                fileContents = fileContents.concat("\n");
            }
            fileReader.close();
            return fileContents;
        } catch(FileNotFoundException e) {
            System.out.println("Error:Description File for " + enemyName + " Not Found. Has it been moved?");
            return "";
        }
    }
}