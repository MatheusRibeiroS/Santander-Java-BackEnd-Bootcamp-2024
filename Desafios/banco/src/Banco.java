import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    protected List<Cliente> getClientes() {
        // create a list of contas
        setContas(List.of(
                new ContaCorrente(new Cliente()),
                new ContaPoupanca(new Cliente())
        ));
        final List<Conta> contas = this.getContas();
        System.out.println("CONTA: " + contas);
        List<Cliente> clientes = null;
        for (Conta conta : contas) {
            if (conta != null) {
                clientes.add(conta.getCliente());
            }
        }

        return clientes == null ? List.of() : clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
