package annie470.U5_W3_D3.exercise1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@AllArgsConstructor
public class DataSourceAdapter implements DataSource {
    private Info info;


    @Override
    public String getNomeCompleto() {
        String nome = info.getNome();
        String cognome = info.getCognome();
        return nome + " " + cognome;
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        LocalDate oggi = LocalDate.now();
        LocalDate localNascita = LocalDate.parse(dataDiNascita.toInstant().toString().substring(0, 10));
        return Period.between(localNascita, oggi).getYears();
    }
}
