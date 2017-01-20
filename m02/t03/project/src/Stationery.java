/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 22:11:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class Stationery {
    String name;
    int amount;
    int cost;

    public Stationery (){
    }

    public Stationery (String name, int amount, int cost){
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

}
