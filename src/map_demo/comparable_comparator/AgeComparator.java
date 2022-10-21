package map_demo.comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student e1, Student e2) {
        if (e1.getAge() > e2.getAge()) {
            return 1;
        } else if (e1.getAge() == e2.getAge()) {
            return 0;
        } else return -1;
    }
}
