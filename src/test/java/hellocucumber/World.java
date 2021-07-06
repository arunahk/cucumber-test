package hellocucumber;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class World {
    public String operation;
    public int x;
    public int y;
}
