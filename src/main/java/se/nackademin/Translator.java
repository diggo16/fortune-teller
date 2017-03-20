/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

/**
 *
 * @author daniel
 */
public class Translator {
    private final static String[] NOUNS_ARR = {"en löneförhöjning", "en lönesänkning", "en fotboja", 
            "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
    private final static String[] VERBS_ARR = {"stor", "liten", "stark", "svag", "mjuk", "hård",
            "snabb", "vacker", "ljus", "mörk"};
    private final static String[] ADJECTIVES_ARR = {"springa", "ljuga", "flyga", "se", "vara", "äta",
            "mäta", "gå", "röra", "resa"};
    
    public String getNoun(int number) {
        return NOUNS_ARR[number];
    }
    public String getVerb(int number) {
        return VERBS_ARR[number];
    }
    public String getAdjectives(int number) {
        return ADJECTIVES_ARR[number];
    }
    
}
