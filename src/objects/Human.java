package objects;

import enums.Direction;
import enums.Mood;
import interfaces.Movable;
import places.*;

public class Human extends Hero implements Movable{
    private Location location;

    public Human (String name, Location location, Mood mood) {
        super(name, location, mood);

    }

    @Override
    public String getName() {
        return super.getName();
    }



    public String cook(){
        return "готовит";
    }



    @Override
    public void sit(){
        System.out.println("сел за стол");
    }


    public void move() {
        System.out.println("переместился");
    }

    @Override
    public String walkAround(Direction direction1, Direction direction2) {
        return "ходила " + direction1.getName()+ "-"+ direction2.getName();
    }
    public String clench (Body.Lips body){
        return "сжала" + body.name;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;

    }
}
