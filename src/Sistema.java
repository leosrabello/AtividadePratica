public class Sistema {
    
    private static void exibirMenu() {

        System.out.println("\n--- MENU DELEGACIA ---");
        System.out.println("1) Cadastra Detetive");
        System.out.println("2) Cadastrar Comissário");
        System.out.println("3) Cadastrar Oficiais");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Listar todos os detetives");
        System.out.println("6) Listar todos os delegado");
        System.out.println("7) Listar todos os oficiais");
        System.out.println("8) Buscar funcionário");
        System.out.println("9) Editar funcionário");
        System.out.println("10) Excluir funcionário");
        System.out.println("11) Excluir todos os funcionário");
        System.out.println("0) Sair");
        System.out.print("\nInforme uma opção: ");

    }

    private static void verificarOpcao(int op) {

        String nome;
        String tipo;
        int idade;
        int numDist;
        int matricula;
        int idDet;
        int idCom;

        switch (op) {
            case 1:

                System.out.println("\nCADASTRO DE DETETIVE:");
                System.out.println("Nome: ");
                nome = Console.lerString();
                System.out.println("Idade: ");
                idade = Console.lerInt();
                System.out.println("Número de Distintivo: ");
                numDist = Console.lerInt();
                System.out.println("Identificação de Detetive: ");
                idDet = Console.lerInt();

                Detetive d1 = new Detetive("Michel Piragine", 34, 12934, 9876);

                Cadastro.cadastrar(d1);

                System.out.println("\nDetetive cadastrado com sucesso!");
                
                break;

            case 2:

            System.out.println("\nCADASTRO DE COMISSÁRIO:");
            System.out.println("Nome: ");
            nome = Console.lerString();
            System.out.println("Idade: ");
            idade = Console.lerInt();
            System.out.println("Número de Distintivo: ");
            numDist = Console.lerInt();
            System.out.println("Identificação de Comissário: ");
            idCom = Console.lerInt();

                Comissário c1 = new Comissário("Daniel", 65, 20206, 8651);

                Cadastro.cadastrar(c1);

                System.out.println("\n Comissário cadastrado com sucesso!");
                
                break;    
            
            case 3:

            System.out.println("\nCADASTRO DE OFICIAL:");
            System.out.println("Nome: ");
            nome = Console.lerString();
            System.out.println("Idade: ");
            idade = Console.lerInt();
            System.out.println("Número de Distintivo: ");
            numDist = Console.lerInt();
            System.out.println("Tipo de Oficial: ");
            tipo = Console.lerString();

                Oficial o1= new Oficial("Cro Magno", 21, 42691, "Cabo");

                Cadastro.cadastrar(o1);

                System.out.println("\nProgramador cadastrado com sucesso!");
                
                break; 

            case 4:

                if (Cadastro.getListaFuncionarios().size() == 0) {
                    System.out.println("Não há funcionários cadastrados....");
                    break;  
                }

                System.out.println("FUNCIONÁRIOS CADASTRADOS: ");
                for (Funcionario temFuncionario : Cadastro.getListaFuncionarios()){
                    System.out.println(temFuncionario);
                }
                
                break;

            case 5:

                System.out.println("\nDETETIVES CADASTRADOS:");

                for (Funcionario temFuncionario : Cadastro.getListaFuncionarios()){
                System.out.println(temFuncionario);

                    if (temFuncionario instanceof Detetive) {
                        System.out.println(temFuncionario);
                    }
                }

                break;  
                
            case 6:

                System.out.println("\nCOMISSÁRIOS CADASTRADOS:");
                for (Funcionario temFuncionario : Cadastro.getListaFuncionarios()){

                    if (temFuncionario instanceof Comissário) {
                        System.out.println(temFuncionario);
                    }
                }
                
                break;

                case 7:

                System.out.println("\nOFICIAIS CADASTRADOS:");
                for (Funcionario temFuncionario : Cadastro.getListaFuncionarios()){

                    if (temFuncionario instanceof Oficial) {
                        System.out.println(temFuncionario);
                    }
                }
                
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

        }   while (op != 0);

    }
}