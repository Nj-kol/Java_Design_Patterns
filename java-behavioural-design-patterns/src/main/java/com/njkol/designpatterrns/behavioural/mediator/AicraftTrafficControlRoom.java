package com.njkol.designpatterrns.behavioural.mediator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 
 * @author Nilanjan Sarkar
 *
 */
// The Concrete Mediator
public class AicraftTrafficControlRoom implements AircraftMediator {
    
	// Colleagues
    private LinkedList<Runway> availableRunways = new LinkedList<>(); 
    private Map<Aircraft, Runway> aircraftRunwayMap = new HashMap<>();
    
    @Override
    public void registerRunway(Runway runway) {
        this.availableRunways.add(runway);
    }
    
    @Override
    public String allotRunwayTo(Aircraft aircraft) {
        Runway nextAvailbleRunway = null;
        if(!this.availableRunways.isEmpty()) {
            nextAvailbleRunway = this.availableRunways.removeFirst();
            this.aircraftRunwayMap.put(aircraft, nextAvailbleRunway);
        }
        return nextAvailbleRunway == null ? 
          null : nextAvailbleRunway.getName();
    }
    
    @Override
    public void releaseRunwayOccupiedBy(Aircraft aircraft) {
        if(this.aircraftRunwayMap.containsKey(aircraft)) {
            Runway runway = this.aircraftRunwayMap.remove(aircraft);
            this.availableRunways.add(runway); 
        }
    }
}