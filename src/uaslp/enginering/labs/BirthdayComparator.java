package uaslp.enginering.labs;

public class BirthdayComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno studentLeft = (Alumno) left;
        Alumno studentRight = (Alumno) right;

        if(studentRight.getBirthday().compareTo(studentRight.getBirthday()) == 0){
            if((studentLeft.getClave()- studentRight.getClave())>0){
                return studentLeft.getClave()-studentRight.getClave();
            }
            return studentRight.getClave() - studentLeft.getClave();
        }else{
            return studentRight.getBirthday().compareTo(studentLeft.getBirthday());
        }
    }
}
