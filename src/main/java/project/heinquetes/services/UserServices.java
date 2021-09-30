package project.heinquetes.services;

import project.heinquetes.dto.UserDTO;
import project.heinquetes.entity.UserEntity;
import project.heinquetes.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

//TODO: Verificar usuários ativos aptos a votar.
/*
public class UserServices {
    private UserRepository repo = new UserRepository;
    List<UserDTO> res = new ArrayList<>();

    private UserRepository repository;

    public List<UserDTO> getativos() {
        List<UserEntity> us = repository.get();
        for (int i = 0; i < us.size(); i++) {
            UserEntity temp1 = us.get(i);
            UserDTO dto = new UserDTO();
            dto.setName(temp1.getName());
            dto.setEmail(temp1.getEmail());
            dto.setCPF(temp1.getCPF());
            res.add(dto);
        }
        return res;
    }
}

 */