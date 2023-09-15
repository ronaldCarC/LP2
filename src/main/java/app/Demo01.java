package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {

		public static void main(String[] args) {
			//Obtener la conexion llamando a la unidad de persistencia
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
			
			// Manejador de entidades
			EntityManager em = fabrica.createEntityManager();
			
			//Procesos
			//Usuario u = new Usuario(123, "Giampierre", "Soto", "giam", "1825", "2002/05/09", 1, 1);
			Usuario u = new Usuario();
			 u.setCod_usua(123);
			 u.setNom_usua("Juan");
			 u.setApe_usua("Perez");
			 u.setUsr_usua("jperez");
			 u.setCla_usua("7854");
			 u.setFna_usua("2000/01/15");
			 u.setIdtipo(1);
			 u.setEst_usua(1);
			
			
			// insert into tb_xx
			em.getTransaction().begin();
			em.persist(u);
			//update tb_xxx set_camp=?? ... where....
			em.merge(u);
			//delete from tb_xxxx where
			em.remove(u);
			// select * from tb_xxx where id=?
			Usuario x = em.find(Usuario.class , 1);
			
			em.getTransaction().commit();
			System.out.println("Registro exitoso");
			
			em.close();

		}
}
