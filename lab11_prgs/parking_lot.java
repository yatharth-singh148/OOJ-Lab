class Vehicle {
    private String companyName;
    private String vehicleNumber;
    private String type;

    public Vehicle(String companyName, String vehicleNumber, String type) {
        this.companyName = companyName;
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Slot {
    private int slotNumber;
    private String size;
    private boolean isOccupied;
    private Vehicle vehicle;

    public Slot(int slotNumber, String size) {
        this.slotNumber = slotNumber;
        this.size = size;
        this.isOccupied = false;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied && vehicle.getType().equals(size)) {
            this.vehicle = vehicle;
            this.isOccupied = true;
            return true;
        }
        return false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}

class Level {
    private int levelNumber;
    private Slot[] slots;
    private int lanes;

    public Level(int levelNumber, int numSlots) {
        this.levelNumber = levelNumber;
        this.lanes = (numSlots + 9) / 10;
        this.slots = new Slot[numSlots];
        for (int i = 0; i < numSlots; i++) {
            slots[i] = new Slot(i + 1, (i % 2 == 0) ? "Small" : "Large");
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Slot slot : slots) {
            if (slot.parkVehicle(vehicle)) {
                System.out.println("Parked at level " + levelNumber + ", slot " + slot.slotNumber);
                return true;
            }
        }
        return false;
    }

    public void removeVehicle(int slotNumber) {
        if (slotNumber > 0 && slotNumber <= slots.length) {
            slots[slotNumber - 1].removeVehicle();
        }
    }
}

class ParkingLot {
    private Level[] levels;

    public ParkingLot(int numLevels, int slotsPerLevel) {
        levels = new Level[numLevels];
        for (int i = 0; i < numLevels; i++) {
            levels[i] = new Level(i + 1, slotsPerLevel);
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                return;
            }
        }
        System.out.println("Parking lot is full!");
    }

    public void removeVehicle(int levelNumber, int slotNumber) {
        if (levelNumber > 0 && levelNumber <= levels.length) {
            levels[levelNumber - 1].removeVehicle(slotNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, 30);

        Vehicle car1 = new Vehicle("Tesla", "ABC123", "Small");
        Vehicle car2 = new Vehicle("Ford", "XYZ789", "Large");

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
    }
}
