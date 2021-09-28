package project.heinquetes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.heinquetes.dto.UserDTO;

@RestController
public class AuthController {
    @PostMapping("/signup")
    public void signup(UserDTO user){

    }
}
