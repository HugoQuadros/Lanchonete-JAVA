public class Sanduiche extends Lanche {

    private int contIngredientes=0;
    private String[] ingredientes=new String[10];


    public Sanduiche(){
        super.setTempoPreparo(15);
    }

    public void adicionarIngrediente(String ingrediente) {
        if(contIngredientes<ingredientes.length) {
            this.ingredientes[contIngredientes] = ingrediente;
            contIngredientes++;
        } else {
            System.out.println("Número máximo de ingredientes atingidos!");
        }
    }

    @Override
    public String toString() {
        String lanche="[ ";
        for(int i=0;i<ingredientes.length;i++) {
            if(ingredientes[i]!=null) {
                lanche += ingredientes[i];
                lanche += " ";
            }
        }
        lanche += "]";
        return lanche;
    }
}