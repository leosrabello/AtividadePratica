import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario func) {
        listaFuncionarios.add(func);
    }

    public static ArrayList<Funcionario> getListaFuncionarios(){
        return (ArrayList<Funcionario>) listaFuncionarios;
        
    }
}