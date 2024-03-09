package com.example.apirouting;

/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;

// Write your code here.
@RestController
public class MyController {
    MyService myService = new MyService();

    @GetMapping("/")
    public String homePage() {
        return myService.homePage();
    }

    @GetMapping("/about")
    public String aboutPage() {
        return myService.aboutPage();
    }
}
