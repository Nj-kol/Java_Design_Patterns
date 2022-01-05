package com.njkol.designpatterrns.behavioural.mediator;

public interface AircraftMediator {
    public void registerRunway(Runway runway);
    public String allotRunwayTo(Aircraft aircraft);    
    public void releaseRunwayOccupiedBy(Aircraft aircraft); 
}