package com.github.kienme;

import java.util.Random;

public class JokerJava {
    private static String[] jokes = {
        "This be a joke",
        "This too",
        "Meh",
        "Way too",
        "Laazy!"
    };

    public static String tellMeAJoke() {
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
