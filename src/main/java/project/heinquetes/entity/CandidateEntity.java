package project.heinquetes.entity;

public class CandidateEntity {
    private String code_cand;
    private String holder_name;
    private String substitute_name;
    private int votos_recebidos;

    public String getCode() {
        return code_cand;
    }

    public void setCode(String code) {
        this.code_cand = code;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public String getSubstitute_name() {
        return substitute_name;
    }

    public void setSubstitute_name(String substitute_name) {
        this.substitute_name = substitute_name;
    }

}
