package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/23/15.
 */
class ViewLocationEvent {
    double x, y
    Date timestamp

    ViewLocationEvent(double x, double y) {
        this.x = x
        this.y = y

        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return "ViewLocationEvent{" +
                "x=" + x +
                ", y=" + y +
                ", timestamp=" + timestamp +
                '}';
    }
}
