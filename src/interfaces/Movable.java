package interfaces;
import enums.Direction;
import places.*;
public interface Movable {
    public void setLocation(Location location) ;
    public String walkAround(Direction direction1, Direction direction2);


}
