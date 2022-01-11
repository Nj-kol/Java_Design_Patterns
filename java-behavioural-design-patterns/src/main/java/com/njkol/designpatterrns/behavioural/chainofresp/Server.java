package com.njkol.designpatterrns.behavioural.chainofresp;

import java.util.HashMap;
import java.util.Map;

/**
 * Server class.
 */
public class Server {
	
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * Client passes a chain of object to server. This improves flexibility and
     * makes testing the server class easier.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Server gets email and password from client and sends the authorization
     * request to the chain.
     */
    public String handleRequest(Request req) {
        return middleware.process(req);
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
    
    public String getResponse(Request req) {
    	if("pageA".equals(req.getPageName()) & !"admin@example.com".equalsIgnoreCase(req.getEmail())) {
    		return "Sorry,only admin can access this page";
    	}
    	return req.getPageName();
    }
}