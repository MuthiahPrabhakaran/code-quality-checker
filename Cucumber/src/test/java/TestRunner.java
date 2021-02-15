import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions", "hooks"},
        tags = "@SmokeTest", 
        plugin = {
                "pretty",
                "html:target/system-reports/html/report.html",
                "json:target/system-reports/json/reports.json",
                "junit:target/system-reports/xml/reports.xml"
        }
)
public class TestRunner {
}
