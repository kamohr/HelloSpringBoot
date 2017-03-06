package sample.springboot.web;

import java.util.Map;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.GET)
    public void getMethod(
            @RequestParam String id,
            @RequestParam Map<String, String> queryParameters,
            @RequestParam MultiValueMap<String, String> multiMap) {

        System.out.println("id=" + id);
        System.out.println(queryParameters);
        System.out.println(multiMap);
    }
}