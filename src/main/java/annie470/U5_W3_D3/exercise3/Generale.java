package annie470.U5_W3_D3.exercise3;

public class Generale extends Ufficiale {

    public Generale() {
        this.stipendio = 5000;
    }

    @Override
    public void getStipendio(int importo) {
        if (importo <= this.stipendio) {
            System.out.println("Il generale percepisce almeno questo stipendio: " + this.stipendio);
        } else if (superiore != null) {
            superiore.getStipendio(importo);
        } else {
            System.out.println("Nessun altro percepisce almeno " + importo);
        }
    }
}
