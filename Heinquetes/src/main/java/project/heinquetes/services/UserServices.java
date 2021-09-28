package project.heinquetes.services;

import project.heinquetes.dto.UserDTO;
import project.heinquetes.entity.UserEntity;
import project.heinquetes.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserServices {
    private UserRepository repo = new UserRepository;
    List<UserDTO> res = new ArrayList<>();

    public UserServices() {
    }

    public List<UserDTO> get() {
        List<UserEntity> usr = repo.get();
        for (int i = 0; i < usr.size(); i++) {
            UserEntity temp = usr.get(i);

            UserDTO dto = new UserDTO();
            dto.setName(temp.getName());
            dto.setAge(temp.getAge());
            dto.setEmail(temp.getEmail());
            dto.setID(temp.getID());
            dto.setCPF(temp.getCPF());
            dto.setPass(temp.getPass());
            dto.setPhone(temp.getPhone());
            dto.setStatus_user(temp.isStatus_user());
            res.add(dto);
        }
        return res;
    }

    private UserRepository repository;

    public List<UserDTO> getativos() {
        List<UserEntity> us = repository.get();
        for (int i = 0; i < us.size(); i++) {
            UserEntity temp1 = us.get(i);
            UserDTO dto = new UserDTO();
            if (temp1.isStatus_user() == true) {
                dto.setName(temp1.getName());
                dto.setAge(temp1.getAge());
                dto.setEmail(temp1.getEmail());
                dto.setID(temp1.getID());
                dto.setCPF(temp1.getCPF());
                dto.setPass(temp1.getPass());
                dto.setPhone(temp1.getPhone());
                dto.setStatus_user(temp1.isStatus_user());
                res.add(dto);
            }
        }
        return res;
    }
}
