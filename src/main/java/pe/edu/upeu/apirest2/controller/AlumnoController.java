package pe.edu.upeu.apirest2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.apirest2.entity.Alumno;
import pe.edu.upeu.apirest2.service.AlumnoService;
@RestController
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoservice;
	
	@GetMapping("/")
	public String mensaje() {
		return "REST";
	}
	
	@GetMapping("/alumno")
	public List<Alumno>getList(){
		return alumnoservice.readAll();
	}
	
	@PostMapping("/alumno/add")
	public String create(@RequestBody Alumno a) {
		alumnoservice.create(a);
		return "Alumno Creado";
	}
	
	@DeleteMapping("/alumno/delete/{id}")
	public String delete(@PathVariable Long id){
		alumnoservice.delete(id);
		return "Alumno Eliminado";
	}
	
	@GetMapping("/alumno/{id}")
	public Alumno read(@PathVariable long id) {
		return alumnoservice.read(id);
	}
	
	@PutMapping("/alumno/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Alumno alumno) {
		System.out.println(id);
		Alumno a = alumnoservice.read(id);
		System.out.println(alumno.getNombres());
		a.setTelefono(alumno.getTelefono());
		a.setCorreo(alumno.getCorreo());
		a.setNombres(alumno.getNombres());
		alumnoservice.update(a);
		return "Alumno Modificado";
	}
	
}
