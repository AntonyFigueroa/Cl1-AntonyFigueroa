package domain;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MavenTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		//INSERTAR
		Empleado e = new Empleado();
		e.setNombres("Antony");
		e.setApellidoPaterno("Figueroa");
		e.setApellidoMaterno("Briceño");
		e.setNumeroHijos(2);
		e.setSueldo(1500);
		e.setFechaNacimiento(28/11/1996);
		
		manager.persist(e);
		
		//ACTUALIZAR
		Empleado e1 = new Empleado();
		e1.setNombres("Antony");
		manager.remove(e1);
		
		//ELIMINAR
		Empleado e2 = manager.getReference( Empleado.class,1);
		manager.remove(e2);
		
		//LISTAR
		List<Empleado> lista = manager.createQuery("from emple",Empleado.class).getResultList();
		for(Empleado empleado : lista)
			System.out.println(empleado);
		
		//QUERY NATIVA
		List<Empleado> listo = manager.createNativeQuery("select * from empleados", Empleado.class).getResultList();
		for (Empleado empleados : listo) {
			System.out.println(empleados);
		}
		
		tx.commit();
					
	}

}
