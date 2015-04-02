package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/23/15.
 */
class HardwareConnectionStateEvent extends AbstractEvent {
    enum State {
        CONNECTED,
        NOT_CONNECTED,
        CONNECTED_WITH_WARNINGS
    }

    State state
    Date timestamp
    String message

    HardwareConnectionStateEvent(State state, String message) {
        this.state = state
        this.message = message

        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return "HardwareConnectionStateEvent{" +
                "state=" + state +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                '}';
    }
}
