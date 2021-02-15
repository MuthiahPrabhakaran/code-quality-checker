package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestarauntSysyemHooks {

    @Before
    public void beforeActions(Scenario sc){
        System.out.println("Before hooks in the scenario: " +sc.getName());
    }

    @After
    public void afterActions(Scenario sc){
        System.out.println("After hooks in the scenario: " +sc.getName());
    }
}
