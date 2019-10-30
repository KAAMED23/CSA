
public class Student
{
    private int earned;
    private int possible;
    private String name;

    public Student(){
        name = "Jane Doe";
    }

    public Student(String n){
        name = n;
        earned = 0;
        possible = 0;
    }

    public void addAssignment(int e,int p){
        earned += e;
        possible += p;
    } 

    public double getPercent(){
        return (earned*100./possible);
    } 

    public String toString(){
        return name + ": points earned: " + earned + ", points possible:" + possible;
    } 

}
