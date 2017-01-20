import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 21:07:35
 * To change this template use File | Settings | File Templates.
 */
public class DeskStationery {
    LinkedList<Stationery> stationeryList = new  LinkedList<Stationery> ();

    public DeskStationery(){
    }

    public int getTotalCost(){
        int cost = 0;
        for(Stationery stationery:stationeryList){
            cost += stationery.getTotalCost();
        }
        return cost;
    }

}
