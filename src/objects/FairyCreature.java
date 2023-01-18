package objects;

import enums.Direction;
import enums.Mood;
import enums.Subjects;
import interfaces.Flyable;
import places.*;


public class FairyCreature extends Hero implements Flyable {
    private Location location;

    public FairyCreature(String name, Location location, Mood mood) {
        super(name, location, mood);

    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public String fly() {
        return "влетел";
    }

    @Override
    public String walkAround(Direction direction1, Direction direction2) {
        return "ходил " + direction1.getName() + "-" + direction2.getName();
    }


    @Override
    public void sit() {
        System.out.println("сел за стол");
    }

    public String praise(Hero who) {
        return "расхваливал " + who.getName();
    }

    public String giveback(Subjects what1, Subjects what2) {
        return " вернул " + what1.getName() + " и " + what2.getName();
    }

    public String smell() {
        return "стал принюхиваться";
    }

    public String like() {
        return this.getName() + "оодобрил";
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}
