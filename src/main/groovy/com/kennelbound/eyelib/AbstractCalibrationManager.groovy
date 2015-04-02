package com.kennelbound.eyelib

import com.kennelbound.eyelib.events.CalibrationCompleteEvent
import groovy.util.logging.Log4j
import net.engio.mbassy.bus.MBassador
import org.springframework.beans.factory.annotation.Autowired

/**
 * Created by samalsto on 3/23/15.
 */
@Log4j
abstract class AbstractCalibrationManager {
    @Autowired
    MBassador eventBus;

    void start() {
        log.debug("Starting calibration...");
    }

    void complete(CalibrationCompleteEvent.Status status, String message, String errorMessage = null, Throwable error = null) {
        CalibrationCompleteEvent event = new CalibrationCompleteEvent(status, message, errorMessage, error);
        eventBus.publish(event)
    }
}
