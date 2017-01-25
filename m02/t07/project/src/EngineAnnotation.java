import java.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 23.01.2017
 * Time: 16:33:38
 * To change this template use File | Settings | File Templates.
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EngineAnnotation {
    double maxSpeed() default 200;
    double maxAcceleration() default 40;
    double speed() default 0;
}

