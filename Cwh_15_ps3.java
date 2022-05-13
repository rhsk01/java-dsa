package com.company;

import java.util.Locale;

public class Cwh_15_ps3 {

    public static void main(String[] args) {
        String b = new String("Rishabh");
        b = b.toLowerCase();
        System.out.println(b);

        String c = "to the point";
        System.out.println(c.replace(" ","_"));

        String letter = "dear <|name|> ,thanks a lot";
        letter = letter.replace("<|name|>","raja");
        System.out.println(letter);

        String d = "this string conatains  doubrl and   tripple space";
        System.out.println(d.indexOf("  "));
        System.out.println(d.indexOf("   "));
    }
}
