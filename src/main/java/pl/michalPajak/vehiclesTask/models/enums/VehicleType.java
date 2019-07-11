package pl.michalPajak.vehiclesTask.models.enums;

public enum VehicleType {
    CAR("CAR", "Car"),
    BUE("BUS", "Bus"),
    TRUCK("TRUCK", "Truck");


    String name;
    String description;

    VehicleType (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "VehicleType{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
