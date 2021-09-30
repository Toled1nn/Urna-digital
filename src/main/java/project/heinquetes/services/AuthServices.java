package project.heinquetes.services;

import org.springframework.stereotype.Service;
import project.heinquetes.dto.UserDTO;
import project.heinquetes.entity.UserEntity;

import java.util.List;
import java.util.UUID;

//TODO: Executar a autenticação do usuário

@Service

public class AuthServices {

    private List<UserEntity> users;
    
    public String login(UserDTO user){
        String CPF = user.getCPF();
        String pass = user.getPass();

        for (UserEntity u: users ){
            if (u.getCPF().equals(CPF) && u.getPass().equals(pass)){
                //dados corretos no login
                return u.getID();
            }
        }
        return null;
    }


    public int signup(UserDTO user){

        // Verificar os dados do login

        //NOME
        if (user.getName().trim().equals("") && user.getName().trim().split(" ").length < 2){
            return 1;
        }
        //CPF
        if (user.getCPF().length() != 11){
            return 2;
        }
        //EMAIL
        if (!user.getEmail().contains("@") == true){
            return 3;
        }
        //SENHA
        if (user.getPass().length() < 6){
            return 4;
        }


        UserEntity entity = new UserEntity();
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPass(user.getPass());
        entity.setCPF(user.getCPF());

        String token = UUID.randomUUID().toString();
        entity.setID(token);

        users.add(entity);

        return 0;
    }

}
