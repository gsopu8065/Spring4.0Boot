package org.nashville;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by srujangopu on 3/16/16.
 */
@Controller
@RequestMapping("/studentform")
public class MyFormController {

    @RequestMapping(method = RequestMethod.GET)
    public String initForm(ModelMap model){

        Student student = new Student();
        model.addAttribute("student", student);
        return "student/studentForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSubmit(
            @ModelAttribute("student") Student student){

        System.out.println(student);
        return "student/sucess";
    }

}
