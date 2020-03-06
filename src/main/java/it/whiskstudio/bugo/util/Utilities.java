package it.whiskstudio.bugo.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilities {

    public static List<String> inizializzaOccasioni() {
        List<String> deck = new ArrayList<String>();

        try {
            File myObj = new File(Utilities.class.getClassLoader().getResource("CarteOccasioni.txt").getFile());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

                deck.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        return deck;
    }

    public static List<String> inizializzaEsperienze() {
        List<String> deck = new ArrayList<String>();

        try {
            File myObj = new File(Utilities.class.getClassLoader().getResource("CarteEsperienze.txt").getFile());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

                deck.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        return deck;
    }
}
