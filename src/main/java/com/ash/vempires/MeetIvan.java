package com.ash.vempires;

import com.ash.vempires.CharacterData.*;

public class MeetIvan {
    
    public static void play() {
        CharacterData.withEdmond = true;
        if (Vempires.walk){
            Dialogue.print("As you enter the hospital Edmond approaches you.");
            Dialogue.print(Chr.Edmond,"I trust your walk was entertaing?");
            Dialogue.print(Chr.Mark,"It was qui—");
            Dialogue.print(Chr.Edmond,"Yeah, I don't actually care.");
        } else {
            Dialogue.print("...");
            Dialogue.print(Chr.Mark,"Um... it looks like the sun's done setting.");
        }
        
        Dialogue.print(Chr.Edmond,"Well then, shall we be going?         ");
        Dialogue.print(Chr.Edmond,"Here, let me rephrase that—LET'S GO");
        Dialogue.print("As you turn to leave you hear a familiar voice.");
        Dialogue.print(Chr.Ivan,"Mark?");
        Dialogue.print(Chr.Edmond,"Oh great, friend of yours?");
        Dialogue.print(Chr.Mark,"Ivan...");
        Dialogue.print(Chr.Ivan,"Mark! You're okay!");
     }
}
