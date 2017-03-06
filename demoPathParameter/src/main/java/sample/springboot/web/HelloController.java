package sample.springboot.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value="/{id}/{name}", method=RequestMethod.GET)
    public void getMethod(@PathVariable int id, @PathVariable String name) {
        System.out.println("id=" + id + ", name=" + name);
    }
}