package pl.pjatk.adalic;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyFirstComponent {
    public MyFirstComponent(ApplicationContext ap) {
        System.out.println("Hello from MyFirstComponent");
        ap.getBean("mySecondComponent", MySecondComponent.class);

    }

//    public MyFirstComponent (MySecondComponent MSC){
//        System.out.println("Hello from MyFirstComponent");
//        MSC.helloFromMethod2();
//    }

    public void helloFromMethod() {
        System.out.println("Hello from MyFirstComponent.helloFromMethod");
    }
}
