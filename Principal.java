import java.util.ArrayList; 
import java.util.Scanner; 
  
public class Principal { 
    private static ArrayList<Cliente> clientes = new ArrayList<>(); 
    private static Scanner sc = new Scanner(System.in); 
 
    public static void main(String[] args) { 
        int opçoes; 
 
        do { 
            exibirMenu(); 
            opçoes = sc.nextInt(); 
            sc.nextLine(); 
 
            switch(opçoes) { 
            case 1: 
                cadastrarCliente(); 
                break; 
            case 2: 
                listarCliente(); 
                break; 
            case 3: 
                atualizarCliente(); 
                break; 
            case 4: 
                deletarCliente(); 
                break; 
            case 5:  
                buscarCliente(); 
                break; 
            case 0: 
             System.out.println("O Sistema de Gerenciamento de Clientes foi encerrado..."); 
                break; 
            default: 
                System.out.println("Está opção não existe no Sistema.");   
            } 
        }while(opçoes != 0); 
    } 
 
    private static void exibirMenu() { 
        System.out.println("\n#### Sistema de Gerenciamento de Clientes ####\n"); 
        System.out.println("1- Cadastrar Novo Cliente."); 
        System.out.println("2- Listar Todos os Clientes."); 
        System.out.println("3- Atualizar Cliente Existente."); 
        System.out.println("4- Deleter um Cliente."); 
        System.out.println("5- Buscar Cliente Pelo Seu ID."); 
        System.out.println("0- Sair do Sistema."); 
        System.out.println("Escolha uma das opções acima: "); 
    } 
 
    private static void cadastrarCliente() { 
        System.out.println("\n#### Cadastrar Novo Cliente ####\n"); 
        System.out.print("ID: "); 
        int id = sc.nextInt(); 
        sc.nextLine(); 
 
        if(encontrarClienteId(id) != null) { 
           System.out.println("Cadastro não realizado! Já existe um cliente com esse ID."); 
            return; 
 
        } 
 
        System.out.print("Nome: "); 
        String nome = sc.nextLine(); 
 
        System.out.print("Email: "); 
        String email = sc.nextLine(); 
 
        System.out.print("Telefone: "); 
        String telefone = sc.nextLine(); 
 
        clientes.add(new Cliente(id, nome, email, telefone)); 
        System.out.println("Cliente cadastrado com sucesso!"); 
    } 
 
    private static void listarCliente() { 
        System.out.println("\n#### Lista de Todos os Clientes ####\n"); 
        if(clientes.isEmpty()) { 
            System.out.println("Não há clientes cadastrados!"); 
            return; 
        }else { 
            for(Cliente cliente : clientes) { 
                System.out.println("ID: " + cliente.getId()); 
                System.out.println("Nome: " + cliente.getNome()); 
                System.out.println("Email: " + cliente.getEmail()); 
                System.out.println("Telefone: " + cliente.getTelefone()); 
                System.out.println("##############################"); 
            } 
        } 
    } 
 
    private static void atualizarCliente() { 
        System.out.println("\n#### Atualizar Cliente Existente ####\n");  
 
        System.out.print("Digite o ID do cliente que deseja atualizar: "); 
        int id = sc.nextInt(); 
        sc.nextLine(); 
 
        Cliente cliente = encontrarClienteId(id); 
        if(cliente == null) { 
            System.out.println("Cliente não encontrado!"); 
            return; 
        } 
 
        System.out.print("Nome (não preencha caso não queira mudar): "); 
        String nome = sc.nextLine(); 
        if(!nome.trim().isEmpty()) { 
            cliente.setNome(nome); 
        } 
 
        System.out.print("Email (não preencha caso não queira mudar): "); 
        String email = sc.nextLine(); 
        if(!email.trim().isEmpty()) { 
            cliente.setEmail(email); 
        } 
 
        System.out.print("Telefone (não preencha caso não queira mudar): "); 
        String telefone = sc.nextLine(); 
        if(!telefone.trim().isEmpty()) { 
            cliente.setTelefone(telefone); 
        } 
 
        System.out.println("Cliente atualizado com sucesso!"); 
    } 
 
    private static void deletarCliente() { 
        System.out.println("\n#### Deletar um Cliente ####"); 
 
 
        System.out.print("Digite o ID do cliente que deseja deletar: "); 
        int id = sc.nextInt(); 
        sc.nextLine(); 
 
        Cliente cliente = encontrarClienteId(id); 
        if(cliente == null) { 
            System.out.println("Cliente não encontrado!"); 
        }else { 
            clientes.remove(cliente); 
            System.out.println("Cliente deletado com sucesso!"); 
        } 
    } 
 
    private static void buscarCliente() { 
        System.out.println("\n#### Buscar Cliente pelo ID ####\n"); 
        System.out.println("Digite o ID do cliente que deseja buscar: "); 
        int id = sc.nextInt(); 
        sc.nextLine(); 
 
        Cliente cliente = encontrarClienteId(id); 
        if(cliente == null) { 
            System.out.println("Cliente não encontrado!"); 
            return; 
        }else { 
            System.out.println("ID: " + cliente.getId()); 
            System.out.println("Nome: " + cliente.getNome()); 
            System.out.println("Email: " + cliente.getEmail()); 
            System.out.println("Telefone: " + cliente.getTelefone()); 
            System.out.println("##############################"); 
        } 
    } 
 
    private static Cliente encontrarClienteId(int id) {  
 
        for(Cliente cliente : clientes) { 
            if(cliente.getId() == id) { 
                return cliente; 
            } 
        } 
 
        return null; 
    } 
}