import java.util.ArrayList;

class Cadastro {
    
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario func) {
        listaFuncionarios.add(func);
    }

    public static ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    //(nota): tive que requisitar ajuda do chat a partir desse ponto para conseguir realizar os obejtivos pedidos

    public static Funcionario buscarFuncionario(String nome) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }

    public static void excluirFuncionario(String nome) {
        listaFuncionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    public static void excluirTodosFuncionarios() {
        listaFuncionarios.clear();
    }
}