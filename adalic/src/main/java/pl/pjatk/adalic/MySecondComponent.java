package pl.pjatk.adalic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MySecondComponent {

   // MyFirstComponent Component;

    public MySecondComponent(@Value("${my.cutom.property}") String somestring) {
       // Component = component;
        System.out.println("Hello from MySecondComponent");
        System.out.println(somestring);

       // component.helloFromMethod();
    }

    public void helloFromMethod2() {
        System.out.println("Hello from MySecondComponent.helloFromMethod2");
    }
}
