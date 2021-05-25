package pe.edu.upeu.apirest2;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.apirest2.entity.Alumno;
import pe.edu.upeu.apirest2.service.AlumnoService;

@SpringBootTest
class ApiRest2ApplicationTests {

	@Autowired
	AlumnoService alumnoservice;
	@Test
	void contextLoads() {
		/*
		List<Alumno> lista = new ArrayList<>();
		lista = alumnoservice.readAll();
		System.out.println(lista.get(0).getNombres());
		*/
		
		System.out.println(alumnoservice.create(new Alumno("elias","elias@upeu.edu.pe","965677059")).getNombres());
		/*
		userservice.delete(new Long(1));
		*/
	}

}
