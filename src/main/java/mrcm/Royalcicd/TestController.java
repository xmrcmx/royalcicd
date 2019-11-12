package mrcm.Royalcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/sayhello")
    public TestEntity getSayHello() {
        return new TestEntity("Hello Royal update v2 asdsd");
    }

}