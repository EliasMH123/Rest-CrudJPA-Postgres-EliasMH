package pe.edu.upeu.apirest2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.apirest2.entity.Alumno;
import pe.edu.upeu.apirest2.repository.AlumnoRepository;

@Service
public class AlumnoService {
	
	@Autowired
	AlumnoRepository repository;
	
	public List<Alumno> readAll(){
		List<Alumno> alumnos=new ArrayList<>();
		repository.findAll().forEach(alumnos::add);
		return alumnos;
	}
	public Alumno create(Alumno alumno) {
		return repository.save(alumno);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	public Alumno read(Long id) {
		return repository.findById(id).get();
	}
	public Alumno update(Alumno a) {
		return repository.save(a);
	}
	
}
