package com.kennelbound.eyelib.listeners

import com.kennelbound.eyelib.events.HardwareConnectionStateEvent

/**
 * Created by samalsto on 3/23/15.
 */
interface IHardwareConnectionStateEventListener {
    void hardwareConnectionStateEvent(HardwareConnectionStateEvent event);
}
