public class Machine {

    private Position location;
    
    public Machine(int lon, int lat){
        this.location = new Position(lon, lat);
    }
    
    public void move(int dx, int dy){
        int oldX = location.getLon();
        int oldY = location.getLat();
        int newX = location.getLon() + dx;
        int newY = location.getLat() + dy;
        location.setLon(newX);
        location.setLat(newY);
        System.out.printf("se movio de (%s, %s) a (%s, %s)%n",oldX,oldY,newX,newY);
    }
    
    public int getX(){
        return location.getLat();}
    public int getY(){
        return location.getLon();}
}
