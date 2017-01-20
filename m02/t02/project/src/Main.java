import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 21:05:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, DeskStationery> deskTab = new HashMap<String, DeskStationery>();
        String workerA = "P. Denton";
        String workerB = "J. McMillan";
        DeskStationery deskStationery = new DeskStationery();
        deskStationery.stationeryList.add(new Pen(3));
        deskStationery.stationeryList.add(new Pencil(3));
        deskStationery.stationeryList.add(new UnaccountedStationery(10, 350,"Ring binder"));
        deskTab.put(workerA, deskStationery);
        deskStationery = new DeskStationery();
        deskStationery.stationeryList.add(new Pen(3));
        deskStationery.stationeryList.add(new Pencil(1));
        deskStationery.stationeryList.add(new Notepad(1));
        deskTab.put(workerB, deskStationery);
        System.out.println(deskTab.get(workerA).getTotalCost());
        System.out.println(deskTab.get(workerB).getTotalCost());
    }
}
