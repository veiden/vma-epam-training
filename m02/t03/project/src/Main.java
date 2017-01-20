import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 21:57:22
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Stationery> basicKit = new LinkedList<Stationery>();
        basicKit.add(new WritingStationery("Pen", 1, 30, WritingColor.BLUE));
        basicKit.add(new WritingStationery("Pen", 1, 30, WritingColor.BLACK));
        basicKit.add(new WritingStationery("Pencil", 2, 25, WritingColor.GREY));
        basicKit.add(new HolderStationery("Punched pocket", 50, 5, 1));
        basicKit.add(new HolderStationery("Ring binder", 2, 350, 100));
        basicKit.add(new PaperStationery("Notepad", 2, 50, 40));
        basicKit.add(new PaperStationery("Paper Bundle", 1, 300, 500));
    }

}
