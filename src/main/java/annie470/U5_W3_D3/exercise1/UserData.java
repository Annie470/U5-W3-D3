package annie470.U5_W3_D3.exercise1;



public class UserData {
    private String nomeCompleto;
    private int eta;


    private void getData(DataSource ds){
        nomeCompleto= ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
