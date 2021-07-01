package hellocucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "timeline:target/reports"
        },
        features = "src/test/resources/features",
        glue = {"hellocucumber"}
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
