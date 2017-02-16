package egzefer.controller;

import egzefer.domain.UserResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by egz on 2/16/17.
 */
@RestController
@RequestMapping(path = "api/users")
public class UserController {


    @RequestMapping(path = "current", method = RequestMethod.GET)
    public @ResponseBody UserResponse currentUser()  {

        return new UserResponse(); //TODO
    }
}
