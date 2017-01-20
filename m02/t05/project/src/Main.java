import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 20.01.2017
 * Time: 15:50:00
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        SubjectList subjectList = new SubjectList();
        Subject subject;
        subject = new Subject(SubjectName.PHYSICS);
        subject.gradeList.put("John Smith", 4);
        subject.gradeList.put("Steven White", 4);
        subjectList.add(subject);
        subject = new Subject(SubjectName.CHEMISTRY);
        subject.gradeList.put("John Smith", 5.0);
        subject.gradeList.put("Steven White", 4.0);
        subject.gradeList.put("Jack Black", 4.5);
        subjectList.add(subject);
        subject = new Subject(SubjectName.HISTORY);
        subject.gradeList.put("John Smith", 92);
        subject.gradeList.put("Steven White", 89);
        subjectList.add(subject);
        subjectList.writeGrades("John Smith");

    }
}
