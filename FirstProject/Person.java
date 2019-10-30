

public class Person
{
   //fields instance data
   // access type variable name
   
   private int age;
   private String name;
   
   
   //constructors instructions that run when the object is created
   //has no return type same name as class
   
   public Person(){
       name = "Jane Doe";
       age = 27;
    
    }
    public Person(String n, int a){
       name = n;
       age = a;
    
    }
    //Methods things the object can do or have done to it
    //access returnType methodName (parameters)
   public void growOlder(){
    age++;
    }
   public void introduce(){
    System.out.println("Hello, my name is " + name + ". I am " + age + "years old");
    
    }
}
