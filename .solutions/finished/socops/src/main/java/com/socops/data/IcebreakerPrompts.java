package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Tech Life theme — coding habits, IDE preferences, and developer culture.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            // Languages & Frameworks
            "wrote code in Python this week",
            "prefers tabs over spaces",
            "has a favorite VS Code theme",
            "uses vim keybindings",
            "knows what COBOL is",
            "has contributed to open source",

            // Dev Culture
            "fixes bugs with print statements",
            "has rubber duck debugged",
            "writes tests BEFORE code",
            "has stayed up coding past 2am",
            "has a side project graveyard",
            "reads tech blogs weekly",

            // Tools & Setup
            "uses a mechanical keyboard",
            "has 10+ browser tabs open now",
            "customizes their terminal",
            "has dotfiles on GitHub",
            "uses dark mode everywhere",
            "has a standing desk",

            // Fun & Quirks
            "knows the konami code",
            "has a favorite algorithm",
            "can explain recursion",
            "has worn a tech conference shirt",
            "has strong opinions on fonts",
            "still remembers their first bug"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
