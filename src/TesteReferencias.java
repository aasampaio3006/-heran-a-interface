import br.com.funcionario.model.Designer;
import br.com.funcionario.model.EditorVideo;
import br.com.funcionario.model.Funcionario;
import br.com.funcionario.model.Gerente;

public class TesteReferencias {

	public static void main(String[] args) {
		//funciona porque todo gerente e u funcionario 
		//isso eh polimorfismo
		//Funcionario g1 = new Gerente();
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
	
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);		
		System.out.println(controle.getSoma());
		
	}

}
