import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Name
 * Date: 20.01.2017
 * Time: 16:07:35
 * To change this template use File | Settings | File Templates.
 */
public class SubjectList {
    LinkedList<Subject> subjectList;

    SubjectList(){
        subjectList = new LinkedList<Subject>();
    }

    public void add(Subject subject){
        subjectList.add(subject);
    }

    public void writeGrades(String studentName){
        System.out.println(studentName + "'s grades:");
        for(Subject subject: subjectList){
            for(Object student: subject.gradeList.keySet()){
                if(student.toString().equals(studentName)){
                    System.out.println(subject.name + " " + subject.gradeList.get(studentName));
                }
            }
        }
    }
}
