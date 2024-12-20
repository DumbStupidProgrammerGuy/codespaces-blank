package com.ash.vempires;

import com.ash.vempires.CharacterData.*;
import com.ash.vempires.Dialogue.*;
import com.ash.vempires.EveningWalk.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;


class Vempires {
    
    static int humanity = 0;
    static int darkness = 0;
    static int hunger = 0;
    static int trust = 0;
    static boolean walk = false;
    static Scanner scanner = new Scanner(System.in);

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
       Dialogue.print("   ");
       Dialogue.print("   ");
       Dialogue.print("...");
       Dialogue.print("   ");
       Dialogue.print("   ");
       CharacterData.metIvan = false;
       Dialogue.print("You wake up in a hospital bed.");
       Dialogue.print("As you open your eyes you notice a strange man holding a clipboard.");
       Dialogue.print(Chr.Edmond, "Oh shit. Shit, shit, shit, shit, shit. Sorry, one second.");
       Dialogue.print(Chr.Edmond, "*flips through pappers*");
       Dialogue.print(Chr.Edmond, "Date and time of re-animation...  undead induction procress... eh, who gives a shit");
       Dialogue.print(Chr.Edmond, "Hi, I'm Edmond. I'm a vampire, oh, and vampires are real, and also you’re a vampire. ");
       CharacterData.metEdmond = true;
       Dialogue.print(Chr.Edmond, "*flips through pappers again*");
       Dialogue.print(Chr.Edmond, "Looks like your body belonged to someone named Mark. He died in a car crash.");
       Dialogue.print(Chr.Edmond, "You’re not actually Mark but you'll probably retain most of his memories for a few years.");
       Dialogue.print( "It's Edmond's job to show you around and explain what’s happening.           ");
       Dialogue.print( "He’s not very good at it.             ");
       Dialogue.print("Edmond can’t go in the sun, so he has to wait for sunset. However, since you’re still in the early stages of vampirism, you can go outside if you want.");
       Dialogue.print("Go for a walk?");
       String input = scanner.nextLine(); 
       if (input.toUpperCase().equals("Y") || input.toUpperCase().equals("YES")) {
        walk = true;
        EveningWalk.play();
       } else {
        CharacterData.EdmondTrust += 1;
        MeetIvan.play();
       }
       
    }

}