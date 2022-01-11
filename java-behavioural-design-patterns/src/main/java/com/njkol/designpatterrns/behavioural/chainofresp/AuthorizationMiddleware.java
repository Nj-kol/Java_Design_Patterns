package com.njkol.designpatterrns.behavioural.chainofresp;

public class AuthorizationMiddleware extends Middleware {

	public AuthorizationMiddleware(Server server) {
		this.server = server;
	}

	public String process(Request req) {
		
		System.out.println("Inside Authorizer");
		if("pageA".equals(req.getPageName()) & !"admin@example.com".equalsIgnoreCase(req.getEmail())) {
    		return "Sorry,only admin can access this page";
    	}
		
		return checkNext(req);
	}
}