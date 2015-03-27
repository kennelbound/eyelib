package com.kennelbound.eyelib

import com.kennelbound.eyelib.events.CalibrationCompleteEvent
import com.kennelbound.eyelib.listeners.ICalibrationCompleteEventListener
import groovy.util.logging.Log4j

/**
 * Created by samalsto on 3/23/15.
 */
@Log4j
abstract class AbstractCalibrationManager {
    @groovy.beans.ListenerList
    List<ICalibrationCompleteEventListener> calibrationCompleteEventListeners;

    void start() {
        log.debug("Starting calibration...");
    }

    void complete(CalibrationCompleteEvent.Status status, String message, String errorMessage = null, Throwable error = null) {
        CalibrationCompleteEvent event = new CalibrationCompleteEvent(status, message, errorMessage, error);
        log.debug("Calibration completed", event)
    }
}
