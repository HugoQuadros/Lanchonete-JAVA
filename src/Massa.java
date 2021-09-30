public class Massa extends Lanche {

    private String molho;

    public Massa() {
        super.setTempoPreparo(30);
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}