import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 23.01.2017
 * Time: 14:35:46
 * To change this template use File | Settings | File Templates.
 */
public class NuclearSubmarine {
    class NuclearSubmarineEngine{
        double maxSpeed;
        double maxAcceleration;
        double speed;

        NuclearSubmarineEngine(){
            maxSpeed = 100;
            maxAcceleration = 40;
            speed = 0;
        }

        void start(int course, int steps){
            DecimalFormat formatter = new DecimalFormat("#.##");
            System.out.println("Started engine, speed = " + formatter.format(speed) + ", course: " + course + ".");
            for (int i = 0; i < steps; ++i){
                speed += maxAcceleration*(maxSpeed - speed)/100;
                System.out.println("Systems normal, current speed = " + formatter.format(speed) +
                        ", current acceleration = " +  formatter.format(maxAcceleration*(maxSpeed - speed)/100) +
                        ", course: " + course + ".");
            }
        }
    }

    NuclearSubmarineEngine engine;

    NuclearSubmarine(){
        this.engine = new NuclearSubmarineEngine();
    }

    public void start(int course, int steps){
        this.engine.start(course, steps);
    }
}
