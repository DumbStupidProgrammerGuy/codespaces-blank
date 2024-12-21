package com.ash.vempires;


class Vempires {
    
    static String time = "Day";
    static int badGuyTrust = 0;
    static int badGuyInfo = 0;
    static int LauraInfo = 0;
    static int humanity = 0;
    static int darkness = 0;
    static int hunger = 0;
    static int trust = 0;
    static boolean walk = false;

    public static Vempires world = new Vempires();
    public static void main(String args[])
    {
        world.start();
    }


    public void start()
    {
     
        // Start the game
       Crash.play();
       
       
    }

}