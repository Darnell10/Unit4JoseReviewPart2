package nyc.c4q.jsonjosereviewpart2;

/**
 * Created by joannesong on 12/19/17.
 */

public class Name {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //we need setters if we dont use retrofit....

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
