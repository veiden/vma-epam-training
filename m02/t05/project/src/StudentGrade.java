/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 20.01.2017
 * Time: 16:00:51
 * To change this template use File | Settings | File Templates.
 */
public class StudentGrade<T> {
    String student;
    T grade;

    StudentGrade (String student, T grade){
        this.student = student;
        this.grade = grade;
    }
}
