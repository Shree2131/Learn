package Oops.Basics;

public class constructorOverloading {
    public static void main(String[] args) {
       Student s1 = new Student();
//       Student s2 = new Student("sainath");
       Student s3 = new Student(123);

       s1.roll = 123;
       s1.pwd = "asdf";
       s1.marks[0] = 100;
       s1.marks[1] = 90;
       s1.marks[2] = 80;

       Student s2 = new Student(s1);//copy
           s2.pwd = "qwer";
           s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }


    }
    static class Student {
        String name;
        int roll;
        String pwd;
        int marks[];

        Student(){//non-paramaterized constructor
            System.out.println("constructor is called...");
        }
        Student(String name){//paramaterized constructor
            this.name = name;
        }
        Student(int roll){//parameterized constructor
            this.roll = roll;
        }
//        Student(Student s1){//shallow copy constructor
//            marks= new int[3];
//            this.name = s1.name;
//            this.roll = s1.roll;
//            this.marks = s1.marks;
//        }

        Student(Student s1){//deep-copy constructor
            marks= new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for (int i = 0; i < marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }
    }
}
