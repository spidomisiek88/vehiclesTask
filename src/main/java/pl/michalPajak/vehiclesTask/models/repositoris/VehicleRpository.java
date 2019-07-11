package pl.michalPajak.vehiclesTask.models.repositoris;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalPajak.vehiclesTask.models.entitis.VehicleEntity;

@Repository
public interface VehicleRpository extends CrudRepository<VehicleEntity, Integer> {

}
