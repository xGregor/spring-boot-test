package de.gregor.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.POST, value = "/testMethod", produces = APPLICATION_JSON_VALUE)
    public TestData testMethod(@RequestBody TestClass test) {
        TestData testData = new TestData();
        testData.setTestProperty(test.getTestProperty());
        return testData;
    }
}
