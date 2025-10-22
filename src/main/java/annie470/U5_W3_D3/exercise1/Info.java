package annie470.U5_W3_D3.exercise1;

import java.util.Date;

public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;


    public String getNome(){
        return nome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
