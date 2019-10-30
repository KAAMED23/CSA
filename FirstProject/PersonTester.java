
public class PersonTester
{
   public static void main (String[] args){
    Person p1 = new Person();
    p1.introduce();
    p1.growOlder();
    p1.growOlder();
    p1.growOlder();
    p1.growOlder();
    p1.introduce();
    Person p2 = new Person("Alana", 34);
    p2.introduce();
    }
}
