package com.jdqm.advancedfunctions.sams;

import java.util.HashSet;

public class EventManager {
    interface OnEventListener {
        void onEvent(int event);
    }

    private HashSet<OnEventListener> onEventListeners = new HashSet<>();

    public void addOnEventListener(OnEventListener onEventListener){
        this.onEventListeners.add(onEventListener);
    }

    public void removeOnEventListener(OnEventListener onEventListener){
        this.onEventListeners.remove(onEventListener);
    }
}
