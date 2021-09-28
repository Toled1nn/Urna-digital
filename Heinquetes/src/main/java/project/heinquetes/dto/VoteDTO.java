package project.heinquetes.dto;

import java.util.Date;

public class VoteDTO {
    private int total_votos;
    private boolean status;

    public int getTotal_votos() {
        return total_votos;
    }

    public void setTotal_votos(int total_votos) {
        this.total_votos = total_votos;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
