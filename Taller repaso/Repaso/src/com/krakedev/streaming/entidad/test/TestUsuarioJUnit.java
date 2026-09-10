thrpackage com.krakedev.streaming.entidad.test;

import org.junit.jupiter.api.Test;

import com.krakedev.streaming.entidad.Plan;
import com.krakedev.streaming.entidad.Usuario;

public class TestUsuarioJUnit {
	
	@Test
	public void testCasoBase() {
		Plan p1 = new Plan("Basico", 35.00,5);
		Usuario u1 = new Usuario("Jasinto", 1, "Colombia", p1);
		double totalCalculado = u1.calcularFacturaMensual();
		
	}
}
