package test.character;

import test.equipments.*;

public class Equipment {
    private final EquipmentType type;
    private final EquipmentName name;

    public Equipment(EquipmentType type, EquipmentName name) {
        this.type = type;
        this.name = name;
    }

    public EquipmentType getType() {
        return type;
    }

    public EquipmentName getName() {
        return name;
    }
}

