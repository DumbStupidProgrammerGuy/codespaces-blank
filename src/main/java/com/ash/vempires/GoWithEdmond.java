package com.ash.vempires;

public class GoWithEdmond {
    public static void play() {
        CharacterData.withEdmond = true;
        if (Vempires.walk){
            Dialogue.print("As you enter the hospital Edmond approaches you.");
            if (CharacterData.withIvan) {
                Dialogue.print(Chr.Edmond,"Um, who the fuck is that?");
                Dialogue.print(Chr.Mark,"This is my friend Ivan, he recognized me on the way in. Sorry.");
                Dialogue.print(Chr.Edmond,"*sigh* This is gonna be fun to explain. Not to mention the paperwork.");
            } else {
                Dialogue.print(Chr.Edmond,"I trust your walk was entertaing?");
            Dialogue.print(Chr.Mark,"It was qui—");
            Dialogue.print(Chr.Edmond,"Yeah, I don't actually care.");
            }
        } else {
            Dialogue.print(Chr.Mark,"Um... it looks like the sun's done setting.");
        }
        Dialogue.print(Chr.Edmond,"Well then, shall we be going?");
        Dialogue.print(Chr.Mark,"...");
        Dialogue.print(Chr.Edmond,"Here, let me rephrase that: LET'S GO.");
        if (!CharacterData.withIvan) {
            MeetIvan.play();
        }
       Dialogue.print(" ");
       Dialogue.print(" ");
       Dialogue.print("...");
       Dialogue.print(" ");
       Dialogue.print(" ");
     }
}
