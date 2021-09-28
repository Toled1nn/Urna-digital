package project.heinquetes.entity;

public class UserEntity {
    private String name;
    private String pass;
    private String email;
    private int CPF;
    private String voto;

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

}
