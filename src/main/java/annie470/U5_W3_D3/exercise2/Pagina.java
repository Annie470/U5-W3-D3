package annie470.U5_W3_D3.exercise2;

import lombok.Data;

@Data
public class Pagina extends ComponenteLibro{
    private int nPagina;

    public Pagina(int nPagina) {
        this.nPagina = 1;
    }

    @Override
    public int getNPagine() {
        return 1;
    }
}
