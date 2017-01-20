/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 22:14:23
 * To change this template use File | Settings | File Templates.
 */
enum WritingColor{
    BLUE,
    LIGHT_BLUE,
    GREY,
    BLACK,
    PURPLE,
    RED,
    GREEN
}


public class WritingStationery extends Stationery{
    WritingColor color;

    WritingStationery(){
        super();
    }

    WritingStationery(String name, int amount, int cost, WritingColor color){
        super(name, amount, cost);
        this.color = color;
    }

}
