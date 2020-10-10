package uaslp.enginering.labs;


public class FirstNameDescendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno studentLeft = (Alumno) left;
        Alumno studentRight = (Alumno) right;

        return studentRight.getFirstName().compareTo(studentLeft.getFirstName());
    }
}
