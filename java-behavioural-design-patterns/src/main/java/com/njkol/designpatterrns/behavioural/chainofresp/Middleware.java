package com.njkol.designpatterrns.behavioural.chainofresp;

public abstract class Middleware {
	
    private Middleware next;
    protected Server server;
    
    /**
     * Builds chains of middleware objects.
     */
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Subclasses will implement this method with concrete checks.
     */
    public abstract String process(Request req);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected String checkNext(Request req) {
        if (next == null) {
            return server.getResponse(req);
        }
        return next.process(req);
    }
}