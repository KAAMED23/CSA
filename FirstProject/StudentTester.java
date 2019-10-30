
public class StudentTester
{

   public static void main (String[] args){
    Student s1 = new Student();
    s1.addAssignment(97, 100);
    System.out.println(s1.getPercent());
    System.out.println(s1);
    
    Student s2 = new Student("Alana");
    s2.addAssignment(74, 80);
    System.out.println(s2.getPercent());
    System.out.println(s2);
}
}
