package project.heinquetes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import project.heinquetes.dto.UserDTO;

@RestController
public class AuthController {
     @PostMapping("/signup")

    public ResponseEntity<String> login(@RequestBody UserDTO user){
        String token = service.login(user);
        if (token == null){
            return ResponseEntity.notFound().build();
            responseHeader.add(headerName: "Authorization", token);

            return ResponseEntity.ok().headers(responseHeader).build();
            

        }

        HttpHeaders responseHeader = new HttpHeaders();

    }
    @PostMapping("/signup")

    public ResponseEntity<String> signup(@RequestBody UserDTO user){

        @Autowired
        private AuthServices service;

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
