package com.github.kienme;

import java.util.Random;

public class JokerJava {
    private static String[] jokes = {
        "A computer once beat me at chess, but it was no match for me at kick boxing.",
        "As long as there are tests, there will be prayer in schools.",
        "What did one ocean say to the other ocean? Nothing, they just waved.",
        "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.",
        "I asked God for a bike, but I know God doesn't work that way. So I stole a bike and asked for forgiveness.",
        "Money talks ...but all mine ever says is good-bye.",
        "Before I criticize a man, I like to walk a mile in his shoes. That way, when I do criticize him, I'm a mile away and I have his shoes.",
        "I can totally keep secrets. It's the people I tell them to that can't.",
        "I used to think I was indecisive, but now I'm not too sure."
    };

    public static String tellMeAJoke() {
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
