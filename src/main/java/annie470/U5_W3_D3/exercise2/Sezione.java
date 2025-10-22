package annie470.U5_W3_D3.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sezione extends ComponenteLibro{
    private List<CompositeLibro> sottoSezioni;

    public Sezione(CompositeLibro... componentiLibro){
        this.sottoSezioni = new ArrayList<>();
        add(componentiLibro);
   }

    @Override
    public int getNPagine() {
        return sottoSezioni.stream()
                .map(CompositeLibro::getNPagine)
                .reduce(0, Integer::sum);
    }
    public void add(CompositeLibro...componentiLibro){
        sottoSezioni.addAll(Arrays.asList(componentiLibro));
    }
}
