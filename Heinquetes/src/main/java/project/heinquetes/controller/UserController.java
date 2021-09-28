package project.heinquetes.controller;

import project.heinquetes.dto.UserDTO;
import project.heinquetes.services.UserServices;

import java.util.List;

public class UserController {
    public List<UserDTO> get(){
        UserServices services = new UserServices();
        List<UserDTO> dtos = services.get();
        return dtos;
    }
}
