package objects;

import interfaces.PoliceMove;

public class Police implements PoliceMove {
    private String name;
    public Police(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String investigate(String what) {
        return "должна расследовать " + what;
    }
}
