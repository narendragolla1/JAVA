package AccessModifiers;
// Access Modifiers: Protect attributes and methods of a class from outside classes to access.
// we have
//    1) Public : Can be accessed by any client class anywhere in my codebase.
//    2) Private : Can be accessed by no one Not even the child class and accessed only within the class
//    3) Default : Can be accessed one package/folder. Default is not a keyword, if we don't specify then complier will consider it as default.

public class Student {
    private String email; // Email of student is not shared with any class
    private String password; // password of student is not shared with any class
    public String name; // Name is shared with all
    public int age;


//    Modifier      Class       Package     Subclass        Global
//    Public        Yes         Yes         yes             yes
//    Protected     Yes         Yes         Yes             No
//    Default       Yes         Yes         No              No
//    Private       Yes         No          No              No


}
