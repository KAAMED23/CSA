public class PollDisplayTest
{
    public static void main(String[] args){
        PollDisplayPanel panel = new PollDisplayPanel("a", "b", "c");
        panel.vote1();
        panel.vote1();
        panel.vote1();
        panel.vote2();
        panel.vote2();
        panel.vote3();
        System.out.println(panel);

    }

}
