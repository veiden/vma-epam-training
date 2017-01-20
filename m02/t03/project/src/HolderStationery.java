/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 22:17:47
 * To change this template use File | Settings | File Templates.
 */
public class HolderStationery  extends Stationery{
    int capacity;

    HolderStationery(){
        super();
    }

    HolderStationery(String name, int amount, int cost, int capacity){
        super(name, amount, cost);
        this.capacity = capacity;
    }

}
