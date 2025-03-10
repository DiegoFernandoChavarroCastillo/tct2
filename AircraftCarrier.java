import java.util.ArrayList;

public class AircraftCarrier extends Ship {

    private int number;
    private int capacity;
    private ArrayList<Plane> airPlanes;

    public AircraftCarrier(int lon, int lat){
        super(lon, lat);
    }
}
