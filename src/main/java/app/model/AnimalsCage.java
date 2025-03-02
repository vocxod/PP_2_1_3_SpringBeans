package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// https://www.baeldung.com/spring-qualifier-annotation
@Component
public class AnimalsCage {

  @Autowired
  @Qualifier("dog")
  private Animal animal;

  @Autowired
  private Timer timer;

  public Timer getTimer() {
    return timer;
  }

  public void whatAnimalSay() {
    System.out.println("Say:");
    System.out.println(animal.toString());
    System.out.println("At:");
    System.out.println(new Timer().getTime());
    // add invoke timer bean
    System.out.println("Bean time is: " + timer.getTime());
    System.out.println("________________________");
  }
}
