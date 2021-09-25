import java.util.List;

public class Student implements IObserver{
    private String login;
    public Student( String login) {this.login=login;}

    @Override
    public void update(List<String> grants) {
        System.out.println("Dear"+" "+login+",\n"+"we have new grants in Astana IT University \n"+grants);
    }
}
