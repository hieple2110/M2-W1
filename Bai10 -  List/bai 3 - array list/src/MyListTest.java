import java.util.ArrayList;

public class MyListTest {
    public static class Student {
        public int id;
        public String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "nhung");
        Student b = new Student(2, "hung");
        Student c = new Student(3, "ngo");
        Student d = new Student(5, "hiep");

        MyArrayList<Student> list = new MyArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(2,d);
        for (int i = 0; i < list.size; i++) {
            Student student = (Student) list.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
