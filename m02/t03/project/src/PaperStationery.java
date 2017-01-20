/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 22:17:58
 * To change this template use File | Settings | File Templates.
 */
public class PaperStationery extends Stationery{
    int sheetAmount;

    PaperStationery(){
        super();
    }

    PaperStationery(String name, int amount, int cost, int sheetAmount){
        super(name, amount, cost);
        this.sheetAmount = sheetAmount;
    }
}
