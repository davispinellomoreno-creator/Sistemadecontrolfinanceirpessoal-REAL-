package Repository;

import Model.Gastos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Gastos, Long> {
}
