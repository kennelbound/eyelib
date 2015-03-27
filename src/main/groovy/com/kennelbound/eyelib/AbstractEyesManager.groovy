package com.kennelbound.eyelib

import com.kennelbound.eyelib.events.EyesLocationEvent
import com.kennelbound.eyelib.events.HardwareConnectionStateEvent
import com.kennelbound.eyelib.events.ViewLocationEvent
import com.kennelbound.eyelib.listeners.ICalibrationCompleteEventListener
import com.kennelbound.eyelib.listeners.IEyesLocationEventListener
import com.kennelbound.eyelib.listeners.IHardwareConnectionStateEventListener
import com.kennelbound.eyelib.listeners.IViewLocationEventListener

/**
 * Created by samalsto on 3/23/15.
 */
abstract class AbstractEyesManager {
    @groovy.beans.ListenerList
    List<IViewLocationEventListener> viewLocationListeners;

    @groovy.beans.ListenerList
    List<ICalibrationCompleteEventListener> calibrationCompleteListeners;

    @groovy.beans.ListenerList
    List<IEyesLocationEventListener> eyesLocationListeners;

    @groovy.beans.ListenerList
    List<IHardwareConnectionStateEventListener> hardwareConnectionStateListeners;

    void init() {}

    abstract void start()

    void viewEvent(double x, double y) {
        fireViewEvent(new ViewLocationEvent(x, y));
    }

    void eyesLocationEvent(double distance, double leftX, double leftY, double leftPupilSize, boolean leftOpen, double rightX, double rightY, double rightPupilSize, boolean rightOpen) {
        fireEyesLocationEvent(new EyesLocationEvent(distance, leftX, leftY, leftPupilSize, leftOpen, rightX, rightY, rightPupilSize, rightOpen));
    }

    void hardwareConnectionStateEvent(HardwareConnectionStateEvent.State state, String message = null) {
        fireHardwareConnectionStateEvent(new HardwareConnectionStateEvent(state, message));
    }
}
