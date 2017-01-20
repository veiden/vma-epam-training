/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 19.01.2017
 * Time: 20:07:11
 * To change this template use File | Settings | File Templates.
 */

enum PenColor{
    BLUE,
    LIGHT_BLUE,
    BLACK,
    PURPLE,
    RED,
    GREEN
}

enum PenType{
    BALLPOINT,
    ROLLERBALL,
    FOUNTAIN
}

public class Pen {
    PenColor color;
    PenType type;
    String manufacturer;
    int inkPercentage;

    public Pen(PenColor color, PenType type, String manufacturer, int inkPercentage){
        this.color = color;
        this.type = type;
        this.manufacturer = manufacturer;
        this.inkPercentage = inkPercentage;

    }

    public boolean equals(Pen value){


        if (this == value){
            return true;
        }
        if (null == value){
            return false;
        }
        if(!this.color.equals(value.color)){
            return false;
        }
        if (!this.type.equals(value.type)){
            return false;
        }
        if (!this.manufacturer.equals(value.manufacturer)){
            return false;
        }
        if (this.inkPercentage != value.inkPercentage){
            return false;
        }
        return true;
    }

    public int hashCode(){
        int hashCode;
        hashCode = 31 + color.hashCode();
        hashCode = hashCode * 31 + type.hashCode();
        hashCode = hashCode * 31 + manufacturer.hashCode();
        hashCode = hashCode * 31 + inkPercentage;
        return hashCode;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("color: ")
          .append(this.color)
          .append("\ntype: ")
          .append(this.type)
          .append("\nmanufacturer: ")
          .append(this.manufacturer)
          .append("\ninkPercentage: ")
          .append(this.inkPercentage);
        return sb.toString();
    }

}
