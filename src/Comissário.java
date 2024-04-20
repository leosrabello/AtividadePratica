class Comissario extends Funcionario {
    
    private int idCom;

    public Comissario(String nome, int idade, int numDist, int idCom) {

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
