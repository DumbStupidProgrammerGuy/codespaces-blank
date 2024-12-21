package com.ash.vempires;

import java.util.Scanner;

// import com.ash.vempires.CharacterData.*;

public class MeetIvan {
    
    static Scanner scanner = new Scanner(System.in);

    public static void play() {
        CharacterData.withIvan = true;
        Dialogue.print("A young man waiting outside the hospital seems to recognize you.");
        Dialogue.print(CharacterData.colors.get(Chr.Ivan) +  "???: Mark?");
        if (CharacterData.withEdmond) {
            Dialogue.print(Chr.Edmond,"Oh great, friend of yours?");
        }
        Dialogue.print(Chr.Mark,"Ivan...");
        CharacterData.metIvan = true;
        Dialogue.print(Chr.Ivan,"Mark! You're okay! They told me you died dude!");
        if (CharacterData.withEdmond) {
            Dialogue.print(Chr.Ivan,"I was just waiting for my mom to pick me up, who's this guy?");
            Dialogue.print(Chr.Edmond,"*sigh* This is gonna be fun to explain. Not to mention the paperwork.");
        } else {
            Dialogue.print(Chr.Ivan,"I was just waiting for my mom to pick me up, you can ride home with me if you want.");
            Dialogue.print("Go with Ivan?");
            String input = scanner.nextLine(); 
            if (input.toUpperCase().equals("Y") || input.toUpperCase().equals("YES")) {
                Dialogue.print("Go with Ivan?");
               } else if (input.toUpperCase().equals("N") || input.toUpperCase().equals("NO")) {
                GoWithEdmond.play();
               }
        }
     }
}
