package annie470.U5_W3_D3.exercise3;

import lombok.Setter;

public abstract class Ufficiale {
    @Setter
    protected Ufficiale superiore;
    protected int stipendio;

    public abstract void getStipendio(int importo);
}
