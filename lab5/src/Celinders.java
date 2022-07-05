import java.util.ArrayList;

public class Celinders  {
    public ArrayList<Celinder> list;
    public Celinders(){
        this.list = new ArrayList<>();
    }
    public double getAvarageVolume(){
        double area = 0;
        for(int i=0; i < list.size(); i ++){
            area += list.get(i).getVolume();
        }
        return area/list.size();
    }
}
