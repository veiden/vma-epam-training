/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 21:08:12
 * To change this template use File | Settings | File Templates.
 */

public abstract class Stationery {
    int amount;
    int cost;

    public Stationery (){
    }

    public Stationery (int amount, int cost){
        this.amount = amount;
        this.cost = cost;
    }

    public void setAmount (int amount){
        this.amount = amount;
    }

    public void addAmount (int value){
        this.amount += value;
    }

    public int getTotalCost(){
        return cost * amount;
    }
}
