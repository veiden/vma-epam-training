import java.lang.annotation.Annotation;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 23.01.2017
 * Time: 14:35:46
 * To change this template use File | Settings | File Templates.
 */



public class NuclearSubmarine {
    
    @EngineAnnotation(maxSpeed = 100)
    class NuclearSubmarineEngine{
        double maxSpeed;
        double maxAcceleration;
        double speed;

        NuclearSubmarineEngine(){

            if(this.getClass().getDeclaredAnnotations().length != 0){
                Annotation a = this.getClass().getAnnotations()[0];
                EngineAnnotation ea = (EngineAnnotation)a;
                maxSpeed = ea.maxSpeed();
                maxAcceleration = ea.maxAcceleration();
                speed = ea.speed();
            } else {
                maxSpeed = 200;
                maxAcceleration = 80;
                speed = 0;
            }
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
