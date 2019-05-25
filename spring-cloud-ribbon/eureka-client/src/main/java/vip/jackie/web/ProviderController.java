package vip.jackie.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(@RequestParam String say) {
        return "from provider: " + say;
    }

}
