package vip.jackie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consume", method = RequestMethod.GET)
    public String consume(@RequestParam String say) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?say={say}", String.class, say);
    }

}
