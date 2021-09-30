package project.heinquetes.entity;

import java.util.Date;

public class VoteEntity {
    private int qtd_votos;
    private boolean status;

    public int getQtd_votos() {
        return qtd_votos;
    }

    public void setQtd_votos(int qtd_votos) {
        this.qtd_votos = qtd_votos;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
