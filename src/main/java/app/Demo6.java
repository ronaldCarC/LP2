package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;
import model.Usuario;

public class Demo6 {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		EntityManager em = fabrica.createEntityManager();

		// select * from tb_usu --> lista
		String jpql = "select p from Producto p";
		List<Producto> lstProductos = em.createQuery(jpql , Producto.class).getResultList();
		
		//mostar contenido del listado
		
		for (Producto p : lstProductos) {
			System.out.println("Codigo: " + p.getId_prod());
			System.out.println("Nombre: " + p.getDes_prod());
			System.out.println("Categoria: " + p.getObjCategoria().getDescripcion());
			System.out.println("Proveedor: " + p.getObjProveedor().getNombre_rs());
			System.out.println("---------------------------------------");
		}
		
		em.close();

	}
}
