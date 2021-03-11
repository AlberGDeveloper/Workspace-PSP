package uem.rest.ejercicioconcesionario.modelo.persistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uem.rest.ejercicioconcesionario.modelo.entidad.Coche;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {
	
	
}