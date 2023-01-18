package com.njkol.designpatterrns.behavioural.chainofresp;

public class AuthorizationMiddleware extends Middleware {

	private Server server;
	
	public AuthorizationMiddleware(Server server) {
		this.server = server;
	}

	public String process(Request req) {
		System.out.println("Inside Authorizer");
		System.out.println("Next Processor in the chain is : " + next);
		if (!server.isAuthorized(req)) {
			String msg = "Sorry,only admin can access this page";
			System.out.println(msg);
			throw new RuntimeException(msg);
		}
		return this.checkNext(req);
	}
}