public class Detetive extends Funcionario{
    
    private int idDet;

    public Detetive (String nome, int idade, int mat) {

        super(nome, idade, mat);

    }

    public Detetive (String nome, int idade, int mat, int idDet){
         super(nome, idade, mat);
         this.idDet = idDet;
    }

    public int getIdDet() {
        return idDet;
    }

    public void setIdDet(int idDet) {
        this.idDet = idDet;
    }



}
