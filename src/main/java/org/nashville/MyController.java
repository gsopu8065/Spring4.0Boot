package org.nashville;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by srujangopu on 3/14/16.
 */

@Controller
public class MyController {

    @RequestMapping("/sample")
    public String showView(){
            return "sample";
    }

    @RequestMapping("/sample2")
    public String showView2(){
        return "header/home";
    }
}
