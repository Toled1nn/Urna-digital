package project.heinquetes.services;

import project.heinquetes.dto.UserDTO;

public class AuthServices {
    public void signup(UserDTO user){
    if(user.getName().trim().equals("") && user.getName().split(" ").length < 2){
        return;
    }
    if(!user.getEmail().contains("@")){
        System.out.println("Email inválido");
    }
    if(user.getPass().length() < 6){
        System.out.println("Senha muito pequena");
    }
    if (user.getCPF().length() < 11){
        System.out.println("CPF inválido");
    }
    }
}
