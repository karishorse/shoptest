package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.SupportApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportApplication.class })
public class CucumberSpingConfiguration {}
