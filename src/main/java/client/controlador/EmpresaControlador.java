package client.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.modelo.Empresa;
import client.servicio.EmpresaServicio;
import client.util.ResponseDTO;

@RestController
@RequestMapping("/empresa")

public class EmpresaControlador {

	@Autowired
	
	EmpresaServicio servicio;
	
	@GetMapping
	public ResponseDTO listar() {
		
	  return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Empresa empre) {
		return servicio.crear(empre);
		
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Empresa empre) {
		return servicio.actualizar(empre);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) {
		
		return servicio.borrar(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
