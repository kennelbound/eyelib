package com.kennelbound.eyelib.logging

import com.kennelbound.eyelib.events.AbstractEvent
import groovy.util.logging.Log4j
import net.engio.mbassy.bus.MBassador
import net.engio.mbassy.listener.Handler
import org.springframework.beans.factory.annotation.Autowired

import javax.annotation.PostConstruct

/**
 * Created by samalsto on 3/27/15.
 */
@Log4j
class EyeLibEventLogger {
    @Autowired
    MBassador eventBus

    @PostConstruct
    void init() {
        eventBus.subscribe(this)
    }

    @Handler
    void handleEvent(AbstractEvent event) {
        log.debug("Event (${event?.class?.name}): $event");
    }
}
