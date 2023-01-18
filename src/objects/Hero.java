package objects;

import exceptions.WrongName;
import places.*;
import enums.Mood;
import interfaces.Movable;

public abstract class Hero implements Movable {
    private final String NO = "no";
    private String name;
    private Location location;
    private Mood mood;

    public Hero() {

    }

    public Hero(String name, Location location, Mood mood) {
        this.name = name;
        this.location = location;
        this.mood = mood;

    }

    public String getName() {
        return name;
    }

    public String showMood() {
        return mood.getName();
    }

    public boolean equals(Location location) {
        return this.location == location;
    }

    ;

    @Override
    public void setLocation(Location location) {
        this.location = location;

    }

    public String getLocation() {
        if (this.location.showLocation().equals("кухня")) {
            return this.name + " переместился на кухню ";
        } else if (this.location.showLocation().equals("стол")) {
            return this.name + " переместился за стол ";
        } else return this.name + "переместился в " + this.location.showLocation();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }


    public String say(int loudness, String what) {
        if (loudness < 100) {
            return " сказал :" + what;
        } else {
            return "закричал" + what;
        }
    }

    public void sit() {
        System.out.println(name + "сел за стол");
    }

    public String sleep(String howlong, String purpose) {
        return "спал " + howlong + purpose;
    }

    public String WakeUp(String when, String why) {
        return "проснулся" + when + why;
    }

    public String sing(int volume, String what) {
        if (volume > 90) {
            return "пела громко" + what;
        } else if (volume > 10) {
            return "пела тихо" + what;
        } else {
            return "пела" + what;
        }
    }

    public String see(String f) {
        if (f.equals(this.NO)) {
            return "не видел";
        } else {
            return "видел " + f;
        }
    }

    public String go() {
        return "съездила";
    }

    public String think(String what) {
        return "подумал " + what;
    }

    public String getattached(Hero who) {
        return "привязался к " + who.getName();
    }


    public String eat(Hero who) {
        return who.getName() + " ел ";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Hero) obj).name.equals(name);
    }

    public String purpose(String purposeе, Hero who) {
        if (who.name.equals("Карлсон ")) {
            return " из-за ночных приключений с ";
        } else {
            throw new WrongName("это не карлсон!!");
        }
    }

    public String sigh() {
        return " вздохнула";
    }

    public String call(String who) {
        return "позвонил" + who;
    }


}
