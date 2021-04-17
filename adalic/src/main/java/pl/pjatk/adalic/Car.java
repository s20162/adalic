package pl.pjatk.adalic;
import org.springframework.stereotype.Component;



@Component
public class Car {

    private String name = "name";


    public Car() {

    }
    public Car(String name) {
    this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
