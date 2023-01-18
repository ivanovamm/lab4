package enums;

public enum Direction {
    FORWARD("вперед"), BACK("взад");
    private String name ;
    Direction(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
