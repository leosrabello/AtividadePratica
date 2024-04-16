public class Comissário extends Funcionario{
    
    private int idCom;

    public Comissário (String nome, int idade, int mat) {
        super(nome, idade, mat);
    }

    public Comissário (String nome, int idade, int mat, int idCom){
         super(nome, idade, mat);
         this.idCom = idCom;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

}
