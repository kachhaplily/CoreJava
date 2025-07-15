
public class Students {

    public static void main(String[] args) {

        InnerStudents std = new InnerStudents();
        InnerStudents std1 = new InnerStudents();
        InnerStudents std2 = new InnerStudents();
        std.name = "lily";
        std.age = 23;
        std.marks = 44.4;

        std1.name = "Sunil";
        std1.age = 27;
        std1.marks = 77.22;

        std2.name = "Kajal";
        std2.age = 23;
        std2.marks = 99.0;
        std1.displayDetailes();
        std2.displayDetailes();
        std.displayDetailes();
    }

}

class InnerStudents {
    int id;
    String name;
    int age;
    Double marks;

    // display detailes

    public void displayDetailes() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }

}
