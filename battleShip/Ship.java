import java.util.Collection;

public class Ship extends Machine {

    private Collection<Sailor> sailors;
    
    public Ship(int lon, int lat){
        super(lon, lat);
    }
}
