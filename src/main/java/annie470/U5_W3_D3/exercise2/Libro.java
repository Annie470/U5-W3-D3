package annie470.U5_W3_D3.exercise2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Libro {
    private int pagine;
    private List<Sezione> sezioni;
    private List<Author> autori;
    private double prezzo;

}
