package com.kennelbound.eyelib.listeners

import com.kennelbound.eyelib.events.CalibrationCompleteEvent

/**
 * Created by samalsto on 3/23/15.
 */
interface ICalibrationCompleteEventListener {
    void calibrationComplete(CalibrationCompleteEvent event);
}
