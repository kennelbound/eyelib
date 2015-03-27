package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/23/15.
 */
class EyesLocationEvent {
    Eye left, right
    double distance
    Date timestamp

    EyesLocationEvent(double distance, double leftX, double leftY, double leftPupilSize, boolean leftOpen, double rightX, double rightY, double rightPupilSize, boolean rightOpen) {
        this.distance = distance
        this.left = new Eye(leftX, leftY, leftPupilSize, leftOpen);
        this.right = new Eye(rightX, rightY, rightPupilSize, rightOpen);
        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return "EyesLocationEvent{" +
                "distance=" + distance +
                ", left=" + left +
                ", right=" + right +
                ", timestamp=" + timestamp +
                '}';
    }

    class Eye {
        double x, y, pupilSize
        boolean open

        Eye(double x, double y, double pupilSize, boolean open) {
            this.x = x
            this.y = y
            this.pupilSize = pupilSize
            this.open = open
        }

        @Override
        public String toString() {
            return "Eye{" +
                    "x=" + x +
                    ", y=" + y +
                    ", pupilSize=" + pupilSize +
                    ", open=" + open +
                    '}';
        }
    }


}
