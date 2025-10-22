package annie470.U5_W3_D3.exercise3;

public class Capitano extends Ufficiale {

    public Capitano() {
        this.stipendio = 2000;
    }

    @Override
    public void getStipendio(int importo) {
        if (importo <= this.stipendio) {
            System.out.println("Il capitano percepisce almeno questo stipendio: " + this.stipendio);
        } else if (superiore != null) {
            superiore.getStipendio(importo);
        } else {
            System.out.println("Nessun altro percepisce almeno " + importo);
        }
    }
}
