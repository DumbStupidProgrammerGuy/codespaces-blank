package com.ash.vempires;

import java.util.HashMap;
import java.util.Map;

public class PlayScene {

    public static Scene openingScene = new Scene();
    public static Scene wakeUpScene = new Scene();
    public static Scene scene3 = new Scene();
    public static Scene scene4 = new Scene();
    public static Scene scene5 = new Scene();

    static Map<String, Scene> scenes = new HashMap<>(Map.ofEntries(
        Map.entry("open", openingScene),
        Map.entry("wake", wakeUpScene),
        Map.entry("", scene3),
        Map.entry("", scene4),
        Map.entry("", scene5)
    ));
    
    static void main(String scene) {
        scenes.get(scene).play();
    }
}
