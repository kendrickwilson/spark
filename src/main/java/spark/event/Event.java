package spark.event;

import spark.Service;

/**
 *
 * Encapsulate event created by system
 *
 */
public class Event {
    private EventType eventType;
    private Service service;

    public Event(EventType eventType) {
        this.eventType = eventType;
    }

    public Event(EventType eventType, Service server) {
        this.eventType = eventType;
        this.service = service;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
