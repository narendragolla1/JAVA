package constructor;

public class Student {

   public String name;
    String batch;
    public String email;
    String state="Active"; // this will be the default value.
   public Student(String name, String email)
    {
        this.name=name;
        this.email=email;

    }
    void changeBatch(String newbatch){
    this.batch=newbatch;

    }
     void pauseCourse(){
        this.state="paused..!";

     }


}
