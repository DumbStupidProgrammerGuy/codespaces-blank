package com.ash.vempires;

public class Crash {
    public static void play() {
       Dialogue.print(Chr.Prev_Mark, "Thanks for the ride man, it's too bad we haven't been able to hang out lately.");
       Dialogue.print(Chr.Ivan, "No problem man, thanks for helping out with the rent. Hey, I'm free next Saturday, we should do something.");
       Dialogue.print(Chr.Prev_Mark, "Sure! I heard there's a new horror movie in theatres, it's supposed to be really good.");
       Dialogue.print(Chr.Ivan, "Yeah, I've never really been a fan of horror films, they always feel like they—");
       Dialogue.print(" ");
       Dialogue.print(" ");
       Dialogue.print("...");
       Dialogue.print(" ");
       Dialogue.print(" ");
       WakeUp.play();
    }
}
