package StudentsList;

import java.util.ArrayList;

public class Students {


    //Method for creating Arraylist of students
    public ArrayList<String> getStudents() {
        ArrayList<String> studentsList = new ArrayList<>() {
            {
                add("Aleksandr");
                add("Daniil");
                add("Anastasiya");
                add("Ivan");
                add("Irina");
                add("Alena");
                add("Artiom");
                add("Ilya");
                add("Viktor");
                add("Kirill");
                add("Arseniy");
                add("Dmitriy");
                add("Nicholas");
            }
        };

        return studentsList;
    }


}
