package com.twitche.twitche;

public class SettingsDefault {
    static int costEmotes = 80;
    static int costEmotesProm = 220;
    static int emotesPer = 3;
    static int costAnimated = 120;
    static int costBadge = 20;
    static int costBadgeProm = 100;
    static int badgesPer = 3;
    static int howMuchToPromotion = 5;
    static int promo = 15;

    public static int getCostEmotes() {
        return costEmotes;
    }

    public static  int getCostEmotesProm() {
        return costEmotesProm;
    }

    public static int getEmotesPer() {
        return emotesPer;
    }

    public static int getCostAnimated() {
        return costAnimated;
    }

    public static int getCostBadge() {
        return costBadge;
    }

    public static int getCostBadgeProm() {
        return costBadgeProm;
    }

    public static int getBadgesPer() {
        return badgesPer;
    }

    public static int getHowMuchToPromotion() {
        return howMuchToPromotion;
    }

    public static int getPromo() {
        return promo;
    }

    public static void setCostEmotes(int costEmotes) {
        SettingsDefault.costEmotes = costEmotes;
    }

    public static void setCostEmotesProm(int costEmotesProm) {
        SettingsDefault.costEmotesProm = costEmotesProm;
    }

    public static void setEmotesPer(int emotesPer) {
        SettingsDefault.emotesPer = emotesPer;
    }

    public static void setCostAnimated(int costAnimated) {
        SettingsDefault.costAnimated = costAnimated;
    }

    public static void setCostBadge(int costBadge) {
        SettingsDefault.costBadge = costBadge;
    }

    public static void setCostBadgeProm(int costBadgeProm) {
        SettingsDefault.costBadgeProm = costBadgeProm;
    }

    public static void setBadgesPer(int badgesPer) {
        SettingsDefault.badgesPer = badgesPer;
    }

    public static void setHowMuchToPromotion(int howMuchToPromotion) {
        SettingsDefault.howMuchToPromotion = howMuchToPromotion;
    }

    public static void setPromo(int promo) {
        SettingsDefault.promo = promo;
    }
}
