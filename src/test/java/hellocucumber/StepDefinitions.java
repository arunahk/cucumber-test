package hellocucumber;

import com.google.inject.Inject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;


public class StepDefinitions {

    @Inject
    World world;

    @Given("^x (.+) y = z$")
    public void setFormula(String operation) {
        world.operation = operation;
    }

    @When("x = {int}")
    public void setX(int x) {
        world.x = x;
    }

    @And("y = {int}")
    public void setY(int y) {
        world.y = y;
    }

    @Then("total is {float}")
    public void calc(double total) {
        switch (world.operation) {
            case "+":
                assertEquals(world.x + world.y, total);
                break;
            case "-":
                assertEquals(world.x - world.y, total);
                break;
            case "*":
                assertEquals(world.x * world.y, total);
                break;
        }
    }

}
