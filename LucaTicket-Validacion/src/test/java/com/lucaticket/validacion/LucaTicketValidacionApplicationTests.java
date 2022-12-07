package com.lucaticket.validacion;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.validacion.controller.ValidacionController;

@SpringBootTest
class LucaTicketValidacionApplicationTests {
	@Autowired
	private ValidacionController controller;

	@Test
	void testValidarPago() {
		boolean haSalidoMalAlgunaVez=false;
		
		for(int i=0 ; i<100 ; ++i) {
			if( controller.validarPago().getCodigo() == -1 ) {
				haSalidoMalAlgunaVez=true;
			}
		}
		
		assertThat(haSalidoMalAlgunaVez==false);
	}

}
