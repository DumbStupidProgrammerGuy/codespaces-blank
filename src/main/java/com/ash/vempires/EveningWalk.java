package com.ash.vempires;

import java.util.Scanner;

public class EveningWalk {
    static Scanner scanner = new Scanner(System.in);

    public static void play() {
       Dialogue.print("You’re outside, you look around and remember the life that you’re human body had...    ");
       Dialogue.print("You remember your—Mark’s friend Ivan, he was also in the car crash.");
       Dialogue.print("You wonder if he’s okay...");
       Vempires.time = "Sunset";
       Dialogue.print("It's sunset, Edmond should be ready to leave soon.");
       Dialogue.print("Return to the hospital?");
       String input = scanner.nextLine(); 
       if (input.toUpperCase().equals("Y") || input.toUpperCase().equals("YES")) {
        Dialogue.print(" ");
        Dialogue.print(" ");
        Dialogue.print("...");
        Dialogue.print(" ");
        Dialogue.print(" ");
        GoWithEdmond.play();
       } else if (input.toUpperCase().equals("N") || input.toUpperCase().equals("NO")) {
        CharacterData.EdmondTrust -= 2;
        Vempires.badGuyInfo += 1;
       }
    }

}