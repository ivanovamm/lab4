package story;

import enums.*;
import exceptions.FoodIsNotReadyException;
import interfaces.BimboMove;
import objects.*;
import places.*;

public class Main {
    public static void main(String[] args) {
        Location kitchen = new Kitchen("кухня");
        Location bedroom = new Bedroom("спальня");
        Location house = new House("дом");
        Location table = new Kitchen("стол");
        Location outside = new Outside("улица");
        Food eskalop = new Food("эскалопы", 10, 100);
        Food.Pudding pudding = new Food.Pudding("шоколадный ", "пуддинг");
        Human Malish = new Human("Малыш ", bedroom, Mood.AGREE);
        Human Frekenbok = new Human("Фрекенбок ", house, Mood.IN_GOOD_MOOD);
        Human Julius = new Human("Дядя Юлиус ", house, Mood.NO);
        Human Frida = new Human("Фрида", house, Mood.NO);
        Human Fille = new Human("Филле", outside, Mood.NO);
        Human Rulle = new Human("Рулле", outside, Mood.NO);
        Body body = new Body();
        Body.Lips lips = body.new Lips();
        lips.name = " губы";
        Body.Finger finger = body.new Finger();
        finger.name = " пухлый указательный пальчик";
        FairyCreature Karlson = new FairyCreature("Карлсон ", kitchen, Mood.TIRED);
        System.out.println(Malish.getName() + Malish.showMood());
        System.out.println(Malish.getName() + Malish.think(Karlson.getName() + " хороший"));
        System.out.println(Julius.getName() + Julius.getAttached(Karlson));
        System.out.println(Karlson.getName() + Karlson.giveback(Subjects.WALLET, Subjects.CLOCK));
        System.out.println(Karlson.getName() + Karlson.say(0, "\"Если меня не кормят, я уже не я\""));
        System.out.println(Karlson.eat(Karlson) + "со всеми");
        System.out.println(Karlson.getName() + Karlson.showMood() + Karlson.nightAdventures() + Fille.getName() + " и " + Rulle.getName());
        Karlson.setLocation(kitchen);
        System.out.println(Karlson.getLocation());
        System.out.println(Karlson.getName() + Karlson.fly() + " и " + Karlson.smell());
        BimboMove Bimbo = new BimboMove() {
            @Override
            public void beInBed() {
                System.out.println( "Бимбо был постели с Малышом");
            }
        };
        Bimbo.beInBed();
        System.out.println(Malish.getName() + Malish.sleep("долго ", "из-за возни с ворами"));
        System.out.println(Malish.getName() + Malish.WakeUp(" незадолго до прилета " + Karlson.getName() , "из-за необычного звука"));
        System.out.println(Frekenbok.getName() + Frekenbok.walkAround(Direction.BACK, Direction.FORWARD) + " и " + Frekenbok.sing(100, ""));
        System.out.println(Time.EARLIER.getName() + " " + Malish.getName() + Malish.see("no") + " как " + Frekenbok.getName() + Frekenbok.sing(0, ""));
        System.out.println("Она была " + Mood.IN_GOOD_MOOD.getName());
        System.out.println(Time.MORNING.getName() + " " + Frekenbok.getName() + Frekenbok.go() + " " + house.showLocation() + "ой к " + Frida.getName());
        Frekenbok.setMood(Mood.CHEERFUL);
        System.out.println(Frekenbok.getName() + Frekenbok.showMood());
        System.out.println(Frekenbok.getName() + Frekenbok.sing(0, ": \"Ах, Фрида, это было бы для тебя лучше!...\""));
        System.out.println(Karlson.getName() + " " + Karlson.fly() + " на " + kitchen.showLocation() + " и " + Karlson.say(200, ""));
        Frekenbok.setMood(Mood.DISMAL);
        System.out.println(Frekenbok.getName() + Frekenbok.showMood() + " " + Frekenbok.cook() + " " + eskalop.getName());
        try {
            eskalop.ready(eskalop.isready);
        } catch (FoodIsNotReadyException e) {
            System.out.println(e.getMessage());
        }
        Malish.setLocation(table);
        Frekenbok.setLocation(table);
        Karlson.setLocation(table);
        Julius.setLocation(table);
        System.out.println(Julius.getLocation() + Malish.getLocation() + Frekenbok.getLocation() + Karlson.getLocation());
        System.out.println(Malish.getName() + Malish.think(":\"Все сидят вместе и обсуждают события прошлой ночи, и всем так уютно\""));
        Karlson.setMood(Mood.PLEASED);
        System.out.println(Karlson.getName() + Karlson.showMood() + " и " + Karlson.praise(Frekenbok));
        System.out.println(Frekenbok.getName() + Frekenbok.sigh() + " и " + Frekenbok.clench(lips));
        System.out.println(Karlson.getName() + body.up(finger));
        System.out.println(Karlson.like(eskalop.quality) + " " + pudding.flavour + pudding.name);
        System.out.println(Frekenbok.getName() + "еще плотнее " + Frekenbok.clench(lips));
        System.out.println(Julius.getName() + Julius.call(" в полицию "));
        Police police = new Police("Полиция");
        System.out.println(police.getName() + " " + police.investigate("113 краж"));
        System.out.println(Julius.getName() + Julius.see(Karlson.getName()));
    }
}