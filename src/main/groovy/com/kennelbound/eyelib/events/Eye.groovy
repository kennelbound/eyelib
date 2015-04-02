package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/31/15.
 */
class Eye {
    EyeSelection selection
    double x, y, pupilSize, viewX, viewY
    boolean open

    @Override
    public String toString() {
        return "Eye{" +
                "selection=" + selection +
                ", x=" + x +
                ", y=" + y +
                ", pupilSize=" + pupilSize +
                ", viewX=" + viewX +
                ", viewY=" + viewY +
                ", open=" + open +
                '}';
    }
}
