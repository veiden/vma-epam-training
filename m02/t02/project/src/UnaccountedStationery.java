/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 21:20:38
 * To change this template use File | Settings | File Templates.
 */
public class UnaccountedStationery extends Stationery{
    String name;

    public UnaccountedStationery(String name){
        super();
        this.name = name;
    }

    public UnaccountedStationery(int amount, int cost,String name){
        super(amount, cost);
        this.name = name;
    }
}
