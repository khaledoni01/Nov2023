package cucumberRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/"},
        glue = {"stepDef"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {


}
