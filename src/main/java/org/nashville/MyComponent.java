package org.nashville;

import org.springframework.stereotype.Component;

/**
 * Created by srujangopu on 3/25/16.
 */

@Component
public class MyComponent {

    public String getSomeResponse(){
        return "this is returned from mycomponent auto wired";
    }

}
