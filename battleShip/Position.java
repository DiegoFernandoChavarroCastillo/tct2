public class Position {

    private int longitude;

    private int latitude;
    
    public Position(int lon, int lat){
        this.longitude = lon;
        this.latitude = lat;
    }

    public int getLon(){
        return longitude;
    }
    
    public int getLat(){
        return latitude;
    }
    
    public void setLon(int lon){
        this.longitude = lon;
    }
    
    public void setLat(int lat){
        this.latitude = lat;
    }
}
