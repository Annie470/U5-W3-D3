package annie470.U5_W3_D3.exercise2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Libro extends ComponenteLibro{
    private List<CompositeLibro> sezioniOppurePagine;
    private List<Author> autori;
    private double prezzo;

    public void aggiungiAutore(Author autore) {
        autori.add(autore);
    }

    public void add(CompositeLibro... componenti) {
       sezioniOppurePagine.addAll(Arrays.asList(componenti));
    }

    @Override
    public int getNPagine() {
        return sezioniOppurePagine.stream()
                .mapToInt(CompositeLibro::getNPagine)
                .sum();
    }

}
