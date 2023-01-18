package enums;

public enum Subjects {
    CLOCK("часы "), WALLET("бумажник");
    private String name;
    Subjects(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
