package com.kennelbound.eyelib.logging

import com.kennelbound.eyelib.events.CalibrationCompleteEvent
import com.kennelbound.eyelib.events.EyesLocationEvent
import com.kennelbound.eyelib.events.HardwareConnectionStateEvent
import com.kennelbound.eyelib.events.ViewLocationEvent
import com.kennelbound.eyelib.listeners.ICalibrationCompleteEventListener
import com.kennelbound.eyelib.listeners.IEyesLocationEventListener
import com.kennelbound.eyelib.listeners.IHardwareConnectionStateEventListener
import com.kennelbound.eyelib.listeners.IViewLocationEventListener
import groovy.util.logging.Log4j

/**
 * Created by samalsto on 3/27/15.
 */
@Log4j
class EyeLibEventLogger implements ICalibrationCompleteEventListener, IEyesLocationEventListener, IHardwareConnectionStateEventListener, IViewLocationEventListener {
    @Override
    void calibrationComplete(CalibrationCompleteEvent event) {
        log.debug("Calibration: $event");
    }

    @Override
    void eyesLocationEvent(EyesLocationEvent event) {
        log.debug("Eyes Location: $event");
    }

    @Override
    void hardwareConnectionStateEvent(HardwareConnectionStateEvent event) {
        log.debug("Hardware State: $event");
    }

    @Override
    void viewEvent(ViewLocationEvent event) {
        log.debug("View Event: $event");
    }
}
