import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LegoTren {
    public static void main (String[] args)
    {
        ArrayList<String> students = new ArrayList<>();
        students.add("Deniz");
        students.add("Melda");
        students.add("Emre");
        students.add("Fatih");
        students.add("Yusuf");
        students.add("Yiit");
        students.add("Yagmur");
        students.add("Emirhan (uyandi)");
        students.add("Mina");
        students.add("Alper Tunga");
        students.add("Dersu (borek al)");
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        students.add("Gencer");
        students.add("Ethemhan");
        System.out.println(students);
        students.remove(3);
        System.out.println(students);
        students.remove(students.size() - 1);
        System.out.println(students);
        if (students.remove("Dersu (borek al)")) {
            System.out.println("removed");
        }
        else {
            System.out.println("not found");
        }
        System.out.println(students);
        String[] studentArray = new String[students.size()];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = students.get(students.size() - i - 1);
        }
//        String[] studentArray = (String[]) students.toArray(); yapamadik
        System.out.println("array");
        studentArray[0] = null;
        System.out.println(Arrays.toString(studentArray));
        students.set(0, "Ilkay Borek");
        System.out.println(students);
    }
}
