import br.com.funcionario.model.Administrador;
import br.com.funcionario.model.Cliente;
import br.com.funcionario.model.Gerente;
import br.com.funcionario.model.SistemaInterno;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
//		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
//		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);


	}

}
