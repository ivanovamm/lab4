package objects;

import exceptions.FoodIsNotReadyException;

public class Food {
    private String name;
    public int isready;
    public Food(String name, int isready){
        this.name = name;
        this.isready = isready;
    }
    public String getName(){
        return name;
    }
     public static class Pudding{
         public String name;
         public String flavour;

        public Pudding( String flavour, String name){
            this.flavour = flavour;
            this.name = name;
        }
    }
     public void ready(int isready) throws FoodIsNotReadyException {
        this.isready = isready;
        if (isready<100){
            throw new FoodIsNotReadyException("блюдо " + name+" не готово");
        }
     }



}
