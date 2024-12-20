package com.ash.vempires;

import java.util.Map;
import java.util.HashMap;



enum Chr
{
    Ivan,
    Prev_Mark,
    Mark,
    Edmond,
    Laura,
};

class CharacterData
{
    static int EdmondTrust = 0;
    static int IvanTrust = 0;
    static int LauraTrust = 0;
    static boolean metEdmond = false;
    static boolean metIvan = true;
    static boolean metLaura = false;
    static boolean withEdmond = false;
    static boolean withIvan = false;
    static boolean withLaura = false;

    static Map<Chr, String> colors = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, "\033[38;2;106;168;79m"),
        Map.entry(Chr.Prev_Mark, "\033[38;2;25;50;175m"),
        Map.entry(Chr.Mark, "\033[38;2;103;78;167m"),
        Map.entry(Chr.Edmond, "\033[38;2;69;129;142m"),
        Map.entry(Chr.Laura, "\033[38;2;166;77;121m")
    ));

    static Map<Chr, String> displayNames = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, "Ivan"),
        Map.entry(Chr.Prev_Mark, "Mark"),
        Map.entry(Chr.Mark, "You"),
        Map.entry(Chr.Edmond, "Edmond"),
        Map.entry(Chr.Laura, "Laura")
    ));

    static Map<Chr, Boolean> metPlayer = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, metIvan),
        Map.entry(Chr.Prev_Mark, true),
        Map.entry(Chr.Mark, true),
        Map.entry(Chr.Edmond, metEdmond),
        Map.entry(Chr.Laura, metLaura)
    ));

    static Map<Chr, Boolean> with = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, withIvan),
        Map.entry(Chr.Prev_Mark, true),
        Map.entry(Chr.Mark, true),
        Map.entry(Chr.Edmond, withEdmond),
        Map.entry(Chr.Laura, withLaura)
    ));
}