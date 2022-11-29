package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Usuario;
import service.ReservaVueloService;

@RestController
public class ReservaVueloController {
	
	@Autowired
	ReservaVueloService reservV=new ReservaVueloService();
	@GetMapping("/reservas/vuelos/{userId}")
	void getReserUsu(@RequestBody Usuario user) {
		reservV.getReserva(user.getDni());
		
	}

}
