package ru.ssau.tk.collectionclasses;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public void setType(WaypointType type) {
        this.type = type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public Settlement getSettlement() {
        return settlement;
    }
}
