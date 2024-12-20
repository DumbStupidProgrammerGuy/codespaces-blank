package com.ash.vempires;

import com.ash.vempires.CharacterData.*;

class Dialogue {

    public static int charDelay (char c) {
        return switch (c) {
            case ',' -> 150;
            case '.' -> 400;
            case '!' -> 400;
            case ':' -> 300;
            case ' ' -> 60;
            case '—' -> 100;
            default -> 40;

        };
    }
    public static void printPart(char dialogue) {
        System.out.print(dialogue);
        int t = charDelay(dialogue);
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void print(Chr ch, String dialogue) {
        printCharacter(ch);
        for (int i = 0; i < dialogue.length(); i++){
            printPart(dialogue.charAt(i));
            if (i == dialogue.length() - 1)
            {
                printPart('\n');
            }
        }
    }
    public static void printCharacter(Chr ch)
    {
        String color = CharacterData.colors.get(ch);
        String displayName = CharacterData.displayNames.get(ch);
        
        System.out.print(color);
        String characterTag = String.format("%s: ",
            displayName);
        for (int i = 0; i < characterTag.length(); i++)
        {
            printPart(characterTag.charAt(i));
        }
    }
}