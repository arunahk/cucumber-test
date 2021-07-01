package hellocucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {

        @Given("^x \\+ y = z$") 
        public void setFormula(){
        }
        @When("x = {int}")
        public void setX(int x){
        }
        @And("y = {int}")
        public void setY(int y){
        }
        @Then("total is {int}")
        public void calc(int total){
        }

}
