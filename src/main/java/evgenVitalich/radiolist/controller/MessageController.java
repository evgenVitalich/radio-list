package evgenVitalich.radiolist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class MessageController {
    @GetMapping
    public String list(){

    return "Привет, Настюшка!!!";

    }


}
