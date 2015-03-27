package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/23/15.
 */
class CalibrationCompleteEvent {
    enum Status {
        SUCCESS,
        FAILURE,
        HARDWARE_NOT_FOUND,
        ABORTED
    }

    Status status
    Date timestamp
    String message
    String errorMessage
    Throwable error

    CalibrationCompleteEvent(Status status, String message, String errorMessage = null, Throwable error = null) {
        this.status = status
        this.message = message
        this.errorMessage = errorMessage
        this.error = error

        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return "CalibrationCompleteEvent{" +
                "status=" + status +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", error=" + error +
                '}';
    }

}
