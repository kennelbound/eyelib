package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 4/1/15.
 */
class AbstractEvent {
    String id

    AbstractEvent() {
        this.id = UUID.randomUUID().toString();
    }

    String getId() {
        return this.id
    }
}
