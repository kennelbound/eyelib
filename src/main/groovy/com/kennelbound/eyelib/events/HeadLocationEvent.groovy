package com.kennelbound.eyelib.events

/**
 * Created by samalsto on 3/31/15.
 */
class HeadLocationEvent extends AbstractEvent {
    double distance, smoothedViewX, smoothedViewY, rotation, pitch, yaw

    Eye left, right

    Date timestamp

    boolean isOpen(EyeSelection selection) {
        switch (selection) {
            case EyeSelection.LEFT:
                return left.open;
            case EyeSelection.RIGHT:
                return right.open;
            case EyeSelection.BOTH:
                return left.open && right.open;
            default:
                return false
        }
    }

    double getViewX(EyeSelection selection) {
        switch (selection) {
            case EyeSelection.LEFT:
                return left.viewX;
            case EyeSelection.RIGHT:
                return right.viewX;
            case EyeSelection.BOTH:
                return smoothedViewX
            default:
                return -1
        }
    }

    double getViewY(EyeSelection selection) {
        switch (selection) {
            case EyeSelection.LEFT:
                return left.viewY;
            case EyeSelection.RIGHT:
                return right.viewY;
            case EyeSelection.BOTH:
                return smoothedViewY
            default:
                return -1
        }
    }
}
