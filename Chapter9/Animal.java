
public class Animal
{
    public String name;
    public Animal(String namei){
        name = namei;
    }

    public void sleep(){
        System.out.println(name + "zizzizzizzzzzeeee");
    }
    public void eat(){
        System.out.println(name + "niam niam");
    }
    public String speak(){
    return "yEEt";
    }
    public String toString(){
        return name+ " says " + speak();
    }
}
