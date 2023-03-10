package kosthub;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {
                "pretty",
                "html: cucumber-html-reports",
                "json: cucumber-json.json" },
        glue = {"kosthub"}
)

public class cucumberRunner extends AbstractTestNGCucumberTests {
}
