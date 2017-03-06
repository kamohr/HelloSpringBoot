package sample.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebApiController {

    @RequestMapping(method=RequestMethod.GET)
    public void method1() {
        throw new MyException("test exception");
    }
}