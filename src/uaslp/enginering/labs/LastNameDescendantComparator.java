package uaslp.enginering.labs;

public class LastNameDescendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno studentLeft = (Alumno) left;
        Alumno studentRight = (Alumno) right;

        return studentRight.getLastName().compareTo(studentLeft.getLastName());
    }
}
