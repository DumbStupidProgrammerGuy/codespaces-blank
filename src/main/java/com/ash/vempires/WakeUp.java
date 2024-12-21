package com.ash.vempires;
import java.util.Scanner;


public class WakeUp {
    static Scanner scanner = new Scanner(System.in);

    public static void play() {
       CharacterData.metIvan = false;
       Dialogue.print("You wake up in a hospital bed.");
       Dialogue.print("As you open your eyes you notice a strange man holding a clipboard.");
       Dialogue.print(CharacterData.colors.get(Chr.Edmond) + "???: Oh shit. Shit, shit, shit, shit, shit. Sorry, one second.");
       Dialogue.print(CharacterData.colors.get(Chr.Edmond) +  "???: *flips through pappers*");
       Dialogue.print(CharacterData.colors.get(Chr.Edmond) + "???: Date and time of re-animation...  undead induction procress... eh, who gives a shit");
       Dialogue.print(CharacterData.colors.get(Chr.Edmond) +  "???: Hi, I'm Edmond. I'm a vampire, oh, and vampires are real, and also you’re a vampire. ");
       CharacterData.metEdmond = true;
       Dialogue.print(Chr.Edmond, "*flips through pappers again*");
       Dialogue.print(Chr.Edmond, "Looks like your body belonged to someone named Mark. To be clear, you aren't Mark anymore but you will retain most of his memories for a while.");
       Dialogue.print( "It's Edmond's job to show you around and explain what’s happening. He’s not very good at it.");
       Dialogue.print("Edmond can’t go in the sun, so he has to wait for sunset. However, since you’re still in the early stages of vampirism, you can go outside if you want.");
       Dialogue.print("Go for a walk?");
       String input = scanner.nextLine(); 
       Dialogue.print(" ");
       Dialogue.print(" ");
       Dialogue.print("...");
       Dialogue.print(" ");
       Dialogue.print(" ");
       if (input.toUpperCase().equals("Y") || input.toUpperCase().equals("YES")) {
        Vempires.walk = true;
        Vempires.humanity += 5;
        Vempires.hunger += 1;
        EveningWalk.play();
       } else {
        CharacterData.EdmondTrust += 1;
        GoWithEdmond.play();
       }
    }
}
