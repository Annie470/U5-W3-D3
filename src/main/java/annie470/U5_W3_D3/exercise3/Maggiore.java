package annie470.U5_W3_D3.exercise3;

public class Maggiore extends Ufficiale {

    public Maggiore() {
        this.stipendio = 3000;
    }

    @Override
    public void getStipendio(int importo) {
        if (importo <= this.stipendio) {
            System.out.println("Il maggiore percepisce almeno questo stipendio: " + this.stipendio);
        } else if (superiore != null) {
            superiore.getStipendio(importo);
        } else {
            System.out.println("Nessun altro percepisce almeno " + importo);
        }
    }
}
