/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 19:58:36
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen(PenColor.BLUE, PenType.FOUNTAIN, "Untitled", 100);
        System.out.println(pen.toString());        
    }

}
