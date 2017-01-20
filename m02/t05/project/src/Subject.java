import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 20.01.2017
 * Time: 15:50:59
 * To change this template use File | Settings | File Templates.
 */

    enum SubjectName{
        PHYSICS,
        CHEMISTRY,
        HISTORY
    }

public class Subject<T> {

    Subject(SubjectName name){
        this.name = name;
        gradeList = new HashMap<String, T>();
    }





    SubjectName name;
    HashMap<String, T> gradeList;


}
