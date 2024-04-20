import java.util.ArrayList;

class Sistema {

    private static void exibirMenu() {

        System.out.println("\n--- MENU DELEGACIA ---");
        System.out.println("1) Cadastrar Detetive");
        System.out.println("2) Cadastrar Comissário");
        System.out.println("3) Cadastrar Oficial");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Listar todos os detetives");
        System.out.println("6) Listar todos os comissários");
        System.out.println("7) Listar todos os oficiais");
        System.out.println("8) Buscar funcionário");
        System.out.println("9) Editar funcionário");
        System.out.println("10) Excluir funcionário");
        System.out.println("11) Excluir todos os funcionários");
        System.out.println("0) Sair");
        System.out.print("\nInforme uma opção: ");

    }

    private static void verificarOpcao(int op) {

        switch (op) {

            case 1:
                cadastrarDetetive();
                break;

            case 2:
                cadastrarComissario();
                break;  

            case 3:
                cadastrarOficial();
                break;

            case 4:
                listarFuncionarios();
                break;

            case 5:
                listarDetetives();
                break;  

            case 6:
                listarComissarios();
                break;

            case 7:
                listarOficiais();
                break;

            case 8:
                buscarFuncionario();
                break;

            case 9:
                editarFuncionario();
                break;  

            case 10:
                excluirFuncionario();
                break;

            case 11:
                excluirTodosFuncionarios();
                break;

            case 0:
                System.out.println("O Sistema foi finalizado...");
                break; 

            default:
                System.out.println("\nOpção Inválida.");
                break;

        }

    }

    public static void executar() {

        int op;

        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);

    }

    private static void cadastrarDetetive() {

        System.out.println("\nCADASTRO DE DETETIVE:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Idade: ");
        int idade = Console.lerInt();
        System.out.println("Número de Distintivo: ");
        int numDist = Console.lerInt();
        System.out.println("Identificação de Detetive: ");
        int idDet = Console.lerInt();

        Detetive d1 = new Detetive(nome, idade, numDist, idDet);
        Cadastro.cadastrar(d1);

        System.out.println("\nDetetive cadastrado com sucesso!");

    }

    private static void cadastrarComissario() {

        System.out.println("\nCADASTRO DE COMISSÁRIO:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Idade: ");
        int idade = Console.lerInt();
        System.out.println("Número de Distintivo: ");
        int numDist = Console.lerInt();
        System.out.println("Identificação de Comissário: ");
        int idCom = Console.lerInt();

        Comissario c1 = new Comissario(nome, idade, numDist, idCom);
        Cadastro.cadastrar(c1);

        System.out.println("\nComissário cadastrado com sucesso!");

    }

    private static void cadastrarOficial() {

        System.out.println("\nCADASTRO DE OFICIAL:");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Idade: ");
        int idade = Console.lerInt();
        System.out.println("Número de Distintivo: ");
        int numDist = Console.lerInt();
        System.out.println("Tipo de Oficial: ");
        String tipo = Console.lerString();

        Oficial o1 = new Oficial(nome, idade, numDist, tipo);
        Cadastro.cadastrar(o1);

        System.out.println("\nOficial cadastrado com sucesso!");

    }

    private static void listarFuncionarios() {

        ArrayList<Funcionario> funcionarios = Cadastro.getListaFuncionarios();

        if (Cadastro.getListaFuncionarios().size() == 0) {
            System.out.println("Não há funcionários cadastrados.");
        } else {
            System.out.println("FUNCIONÁRIOS CADASTRADOS:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }

        }

    }

    private static void listarDetetives() {

        ArrayList<Funcionario> funcionarios = Cadastro.getListaFuncionarios();

        System.out.println("\nDETETIVES CADASTRADOS:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Detetive) {
                System.out.println(funcionario);
            }
        }
    }

    private static void listarComissarios() {

        ArrayList<Funcionario> funcionarios = Cadastro.getListaFuncionarios();

        System.out.println("\nCOMISSÁRIOS CADASTRADOS:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Comissario) {
                System.out.println(funcionario);
            }
        }

    }

    private static void listarOficiais() {

        ArrayList<Funcionario> funcionarios = Cadastro.getListaFuncionarios();

        System.out.println("\nOFICIAIS CADASTRADOS:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Oficial) {
                System.out.println(funcionario);
            }
        }

    }

    private static void buscarFuncionario() {

        System.out.println("\nBUSCAR FUNCIONÁRIO:");
        System.out.println("Digite o nome do funcionário:");
        String nome = Console.lerString();
        Funcionario funcionario = Cadastro.buscarFuncionario(nome);
        if (funcionario != null) {
            System.out.println("Funcionário encontrado:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
        
    }

    private static void editarFuncionario() {

        System.out.println("\nEDITAR FUNCIONÁRIO:");
        System.out.println("Digite o nome do funcionário:");
        String nome = Console.lerString();
        Funcionario funcionario = Cadastro.buscarFuncionario(nome);
        if (funcionario != null) {
            System.out.println("Digite o novo nome:");
            String novoNome = Console.lerString();
            funcionario.setNome(novoNome);
            System.out.println("Funcionário editado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }

    }

    private static void excluirFuncionario() {

        System.out.println("\nEXCLUIR FUNCIONÁRIO:");
        System.out.println("Digite o nome do funcionário:");
        String nome = Console.lerString();
        Cadastro.excluirFuncionario(nome);
        System.out.println("Funcionário excluído com sucesso.");

    }

    private static void excluirTodosFuncionarios() {

        Cadastro.excluirTodosFuncionarios();
        System.out.println("Todos os funcionários foram excluídos.");

    }

}