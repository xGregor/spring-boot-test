package de.gregor.demo;

import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.POST, value = "/testMethod", produces = APPLICATION_JSON_VALUE)
    public TestData testMethod(@RequestBody TestClass test) {
        TestData testData = new TestData();
        testData.setTestProperty(test.getTestProperty());
        return testData;
    }

    @RequestMapping("/tests")
    public @ResponseBody String getTests() {
        return "{\"success\": true}";
    }

}
