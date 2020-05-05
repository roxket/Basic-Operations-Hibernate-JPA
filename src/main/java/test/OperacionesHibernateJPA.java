/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.roxket.DAO.PersonaDAO;
import com.roxket.domain.Persona;

/**
 *
 * @author roxket
 */
public class OperacionesHibernateJPA {
	public static void main(String[] args){
		//listar()
		PersonaDAO personaDao = new PersonaDAO();
		personaDao.listar();
		
		// insertar()
		Persona persona = new Persona();
		persona.setNombre("Carlos");
		persona.setApellido("Gomez");
		persona.setEmail("cperez@mail.com");
		persona.setTelefono("3344");
		//personaDao.insertar(persona);
		
		//modificar()
//		persona.setIdPersona(3);
//		persona = personaDao.buscarPersonaPorId(persona);
//		System.out.println("Persona encontrada: " + persona);
//		//persona.setNombre("Carlos");
//		persona.setApellido("Esparza");
//		persona.setEmail("cesparza@mail.com");
//		//persona.setTelefono("3344");
//		personaDao.modificar(persona);
//		personaDao.listar();
		
		//eliminar()
		//opcion1
		persona.setIdPersona(3);
		persona = personaDao.buscarPersonaPorId(persona);
		personaDao.eliminar(persona);
		//opcion2
		//persona.setIdPersona(3);
		//personaDao.eliminar(persona);
		personaDao.listar();
		
		
		
	}	
}
