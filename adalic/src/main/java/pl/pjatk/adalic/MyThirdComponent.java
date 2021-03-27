package pl.pjatk.adalic;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext) {
        MyFirstComponent first = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent second = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        first.helloFromMethod();
        second.helloFromMethod2();
        System.out.println("hello from MyThirdComponent");
    }
}
