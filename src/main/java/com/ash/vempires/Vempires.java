package com.ash.vempires;

import com.ash.vempires.CharacterData.*;
import com.ash.vempires.Dialogue.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



class Vempires {
    
    public static Vempires world = new Vempires();
    public static void main(String args[])
    {
        world.start();
    }


    public void start()
    {
     
        // Start the game
       Dialogue.print(Chr.Prev_Mark, "Thanks for the ride man, it's too bad we haven't been able to hang out lately.");
       Dialogue.print(Chr.Ivan, "No problem man, thanks for helping out with the rent. Hey, I'm free next Saturday, we should do something.");
       Dialogue.print(Chr.Prev_Mark, "Sure! I heard there's a new horror movie in theatres, it's supposed to be really good.");
       Dialogue.print(Chr.Ivan, "Yeah, I've never really been a fan of horror films, they always feel like they—");
       Dialogue.print(Chr.Mark, "   ");
       Dialogue.print(Chr.Mark, "   ");
       Dialogue.print(Chr.Mark, "...");
       Dialogue.print(Chr.Mark, "Where am I?");
       
    }

}