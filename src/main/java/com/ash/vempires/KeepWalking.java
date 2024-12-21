package com.ash.vempires;

import java.util.Scanner;

public class KeepWalking {
    static Scanner scanner = new Scanner(System.in);

    public static void play() {
        Vempires.time = "Night";
       Dialogue.print("It's way past sunset, Edmond'll be waiting for you.");
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
        CharacterData.EdmondTrust -= 4;
        Vempires.badGuyInfo += 1;
        Dialogue.print("You decide to stay outside a while longer.");
        Dialogue.print(" ");
        Dialogue.print(" ");
        Dialogue.print("...");
        Dialogue.print(" ");
        Dialogue.print(" ");
        Dialogue.print("One of the extremists invites you to head back to their base with them.");
        Dialogue.print("Follow them to the base?");
        input = scanner.nextLine(); 
        if (input.toUpperCase().equals("Y") || input.toUpperCase().equals("YES")) {
         Dialogue.print(" ");
         Dialogue.print(" ");
         Dialogue.print("...");
         Dialogue.print(" ");
         Dialogue.print(" ");
         GoWithEdmond.play();
        } else if (input.toUpperCase().equals("N") || input.toUpperCase().equals("NO")) {
         Vempires.badGuyTrust += 1;
         Vempires.badGuyInfo += 2;
         Vempires.darkness += 2;
       }
    }
}
}
