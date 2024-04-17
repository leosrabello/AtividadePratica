public class Comissário extends Funcionario{
    
    private int idCom;

    public Comissário (String nome, int idade, int numDist) {
        super(nome, idade, numDist);
    }

    public Comissário (String nome, int idade, int numDist, int idCom){
         super(nome, idade, numDist);
         this.idCom = idCom;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

}
