package pl.michalPajak.vehiclesTask.services;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.michalPajak.vehiclesTask.models.entitis.VehicleEntity;
import pl.michalPajak.vehiclesTask.models.enums.VehicleType;
import pl.michalPajak.vehiclesTask.models.repositoris.VehicleRpository;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class VehicleServiceTest {

    @Mock
    VehicleRpository vehicleRpository;
    @InjectMocks
    VehicleService vehicleService;
    @Autowired
    MockMvc mockMvc;
    VehicleEntity car;
    VehicleEntity bus;
    VehicleEntity truck;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        car = new VehicleEntity();
        car.setId(1);
        car.setVehicleType(VehicleType.CAR);
        car.setFullTank(40);
        car.setFuelLevel(40);
        car.setAvgConsumption(0.1);

        bus = new VehicleEntity();
        bus.setId(2);
        bus.setVehicleType(VehicleType.BUS);
        bus.setFullTank(100);
        bus.setFuelLevel(100);
        bus.setAvgConsumption(0.5);

        truck = new VehicleEntity();
        truck.setId(3);
        truck.setVehicleType(VehicleType.CAR);
        truck.setFullTank(130);
        truck.setFuelLevel(130);
        truck.setAvgConsumption(0.7);
    }

    @Test
    public void shouldUpdateFuelLevel() {
        double expectedFuelLevel = 10;

        Mockito.when(vehicleRpository.save(any(VehicleEntity.class))).thenReturn(car);

        Assertions.assertEquals(expectedFuelLevel, vehicleService.updateFuelLevel(car, expectedFuelLevel));
    }
}
