package org.nashville;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by srujangopu on 3/14/16.
 */

@Controller
public class MyController {

    @Autowired
    MyComponent myComponent;


    @RequestMapping("/sample")
    public String showView(Model model){
        System.out.println(myComponent.getSomeResponse());
        model.addAttribute("text", myComponent.getSomeResponse());
        return "autoExample";
    }

    @RequestMapping("/sample2")
    public String showView2(@RequestParam(name = "studentName") String studentName,
                            @RequestParam(name = "studentRoll") String studentRoll,
                            Model model){
        System.out.println(studentName);
        System.out.println(studentRoll);

        model.addAttribute("myStudentName", studentName);
        model.addAttribute("myStudentRoll", studentRoll);
        return "header/home";
    }

    @RequestMapping("/sample3")
    public String showView3(@RequestBody String body){
        System.out.println(body);
        return "header/home";
    }
}
