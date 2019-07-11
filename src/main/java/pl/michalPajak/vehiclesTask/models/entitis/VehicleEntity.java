package pl.michalPajak.vehiclesTask.models.entitis;

import lombok.Data;
import pl.michalPajak.vehiclesTask.models.enums.VehicleType;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "vehicle")
@Data
public class VehicleEntity {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "full_tank")
    private double fullTank;
    @Column(name = "fuel_level")
    private double fuelLevel;

    public VehicleType getVehicleType() {
        return VehicleType.valueOf(this.vehicleType);
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleEntity)) return false;
        VehicleEntity that = (VehicleEntity) o;
        return getId() == that.getId() &&
                Double.compare(that.getFullTank(), getFullTank()) == 0 &&
                Double.compare(that.getFuelLevel(), getFuelLevel()) == 0 &&
                getVehicleType().equals(that.getVehicleType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVehicleType(), getFullTank(), getFuelLevel());
    }
}
