import java.util.ArrayList;

public class Fleet {

    private int name;
    private ArrayList<Machine> machines;
    private ArrayList<Sailor> sailors;
    private Board board;
    
    public Fleet(){
        this.name = name;
        this.machines = new ArrayList<>();
        this.sailors = new ArrayList<>();
        board = new Board();
    }

    public void moveNorth(){
        for (Machine m : machines){
            m.move(0,45);
        }
    }
    public ArrayList willBeDestroyed(int longitud, int latitude)
    {
        ArrayList<Machine> maquinas = new ArrayList<>();
        for(Machine m : machines){
            if (m.getX() == latitude && m.getY() == longitud){
                maquinas.add(m);
            }
        }
        return maquinas;
    }
    
}
