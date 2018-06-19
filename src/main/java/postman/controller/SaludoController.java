package postman.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import postman.model.SaludoModel;


@RestController
public class SaludoController {

    @Autowired
    private SaludoModel model;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        model.setName("Hello Json");
        return model.toString();
    }
}
