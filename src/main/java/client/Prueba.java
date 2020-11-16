package client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Prueba {
	
	@GetMapping("/prueba")
	
		public String empre() {
			
			return "hi";
		}
		
	

}
