package annie470.U5_W3_D3.exercise2;

import lombok.Data;

@Data
public abstract class ComponenteLibro implements CompositeLibro {
    protected int nPagine;


    @Override
    public int getNPagine() {
        return nPagine;
    }
}
