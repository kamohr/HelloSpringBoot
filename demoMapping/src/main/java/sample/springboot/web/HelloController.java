package sample.springboot.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.POST)
    public Hoge hello(@RequestBody Hoge param) {
        System.out.println(param);

        Hoge hoge = new Hoge();
        hoge.id = 20;
        hoge.value = "Response";

        return hoge;
    }
}
