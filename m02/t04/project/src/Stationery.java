import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 22:11:46
 * To change this template use File | Settings | File Templates.
 */
public abstract class Stationery implements Comparable<Stationery> {
    String name;
    int amount;
    int cost;

    public Stationery (){
    }

    public int compareTo(Stationery obj){
        return name.compareTo(obj.name);
    }

    public Stationery (String name, int amount, int cost){
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nname: ")
          .append(name)
          .append("\namount: ")
          .append(amount)
          .append("\ncost: ")
          .append(cost);
        return sb.toString();
    }

}

class NameComparator implements Comparator<Stationery>{
    public int compare(Stationery a, Stationery b){
        return a.name.compareTo(b.name);
    }
}

class CostComparator implements Comparator<Stationery>{
    public int compare(Stationery a, Stationery b){
        return a.cost - b.cost;
    }
}

class FullComparator implements Comparator<Stationery>{
    public int compare(Stationery a, Stationery b){
        if (a.cost == b.cost){
            return a.name.compareTo(b.name);
        } else {
            return a.cost - b.cost;
        }
    }
}

