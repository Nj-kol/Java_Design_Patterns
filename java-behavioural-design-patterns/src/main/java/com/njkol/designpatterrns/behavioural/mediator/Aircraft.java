package com.njkol.designpatterrns.behavioural.mediator;

// Colleague 1
public class Aircraft {
	
    private AircraftMediator mediator;
    private String flightName;
 
    public Aircraft(AircraftMediator mediator, String flightName) {
        this.mediator = mediator;
        this.flightName = flightName;
    }

    public void startLanding() {
        String runway = this.mediator.allotRunwayTo(this);
        if(runway == null) {
            //informing passengers
            System.out.println("Due to traffic, there's a delay in landing of " + this.flightName );  
        } else {
            System.out.println("Currently landing " + this.flightName + " on " + runway);  
        }  
    }

    public void finishLanding() {
       System.out.println(this.flightName + "landed successfully");
       this.mediator.releaseRunwayOccupiedBy(this);
    }
}