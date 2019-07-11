package pl.michalPajak.vehiclesTask.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.michalPajak.vehiclesTask.models.entitis.VehicleEntity;
import pl.michalPajak.vehiclesTask.models.repositoris.VehicleRpository;

@Service
@Data
public class VehicleService {

    @Autowired
    VehicleRpository vehicleRpository;

    @Transactional
    public VehicleEntity updateFuelLevel(VehicleEntity vehicleEntity, double actualFuelLevel) {

        vehicleEntity.setFuelLevel(actualFuelLevel);
        vehicleRpository.save(vehicleEntity);

        return vehicleEntity;
    }
}
