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
    static Map<Chr, String> colors = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, "\033[38;2;106;168;79m"),
        Map.entry(Chr.MarkHuman, "\033[38;2;25;25;175m"),
        Map.entry(Chr.Mark, "\033[38;2;103;78;167m"),
        Map.entry(Chr.Edmond, "\033[38;2;69;129;142m"),
        Map.entry(Chr.Laura, "\033[38;2;166;77;121m")
    ));

    static Map<Chr, String> displayNames = new HashMap<>(Map.ofEntries(
        Map.entry(Chr.Ivan, "Ivan"),
        Map.entry(Chr.MarkHuman, "Mark"),
        Map.entry(Chr.Mark, "Mark"),
        Map.entry(Chr.Edmond, "Edmond"),
        Map.entry(Chr.Laura, "Laura")
    ));
}