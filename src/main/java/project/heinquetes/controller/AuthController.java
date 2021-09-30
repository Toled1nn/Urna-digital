package project.heinquetes.controller;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import project.heinquetes.dto.UserDTO;
import project.heinquetes.services.AuthServices;

@RestController
public class AuthController {

    @Autowired
    private AuthServices service;

    @PostMapping("/signup")
    public ResponseEntity<String> login(@RequestBody UserDTO user){
        String token = service.login(user);

        if(token == null){
            return ResponseEntity.notFound().build();
        }
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.add("Authorization",token);

        return ResponseEntity.ok().headers(responseHeader).build();
    }
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDTO user){

        int result = service.signup(user);

        if (result == 1){
            //NOME
            return ResponseEntity.badRequest().body("Nome de usuário inválido");
        } else if (result == 2){
            //CPF
            return ResponseEntity.badRequest().body("CPF inválido");
        } else if (result == 3){
            //EMAIL
            return ResponseEntity.badRequest().body("Email inválido");

        } else if (result == 4){
            return ResponseEntity.badRequest().body("Senha inválida");
            //SENHA
        }

        return ResponseEntity.ok().build();
    }
}

