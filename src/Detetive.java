class Detetive extends Funcionario {
    
    private int idDet;

    public Detetive(String nome, int idade, int numDist, int idDet) {

        super(nome, idade, numDist);
        this.idDet = idDet;
        
    }

    public int getIdDet() {
        return idDet;
    }

    public void setIdDet(int idDet) {
        this.idDet = idDet;
    }
}