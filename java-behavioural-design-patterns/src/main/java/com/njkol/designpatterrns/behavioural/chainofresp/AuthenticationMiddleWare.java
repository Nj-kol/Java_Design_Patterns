package com.njkol.designpatterrns.behavioural.chainofresp;

public class AuthenticationMiddleWare extends Middleware {
	
	private Server server;
	
    public AuthenticationMiddleWare(Server server) {
        this.server = server;
    }

    public String process(Request req) {
		System.out.println("Inside Authenticator");
		System.out.println("Next Processor in the chain is : " + next);
        if (!server.hasEmail(req.getEmail())) {
            System.out.println("This email is not registered!");
            throw new RuntimeException("This email is not registered!");
        }
        if (!server.isValidPassword(req.getEmail(), req.getPassword())) {
            System.out.println("Wrong password!");
            throw new RuntimeException("Wrong password!");
        }
        return this.checkNext(req);
    }
}
