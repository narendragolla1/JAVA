package Constructor;
// constructor doesn't have return type and function name should be same as class name.


public class Student {
    String name;
    String batch;
    int age;
//    This is the default constructor of student class.
//    This is invoked when object is created not when class is created.
//    This default constructor don't take any parameters
//    By default even if you don't declare default constructor we get inbuild
//    Language will create default constructor.
    Student()
    {
        age=20;
        name="narendra";
        batch="bt 2023";
    }
//    Copy constructor: constructor that  create a new object by coping the value of attribute from another object of same class.
    Student(Student other)
    {
//      Here this keyword refers to current object. It is just like self keyword on python
        this.age=other.age;
        this.batch=other.batch;
        this.name=other.name;
    }

//    Parameter constructor
    Student(String name,int age, String batch)
    {
//      this.name is object data, whereas name is the parameter we sent to assign value.
        this.name=name;
        this.age=age;
        this.batch=batch;
    }


    public static void main(String[] args) {
//              Default constructor Example

        Student student=new Student();

//      Student() function will call default constructor whenever new object is created.
//      Now student object is created with default name, age and batch.

        System.out.println("Student name is "+student.name); // narendra
        System.out.println("Student age is "+student.age);  //22
        System.out.println("Student batch is "+student.batch); // bt 2023
//              Copy constructor

        Student student1=new Student(student);
        System.out.println("Student1 name is "+student1.name); // narendra
        System.out.println("Student1 age is "+student1.age); //22
        System.out.println("Student1 batch is "+student1.batch);// bt 2023

//        Parameter constructor

        Student student2=new Student("mahendra",25,"bt 2019");
        System.out.println("Student2 name is "+student2.name); // mahendra
        System.out.println("Student2 age is "+student2.age); // 25
        System.out.println("Student2 batch is "+student2.batch); // bt 2019




    }
}

