package com.njkol.designpatterrns.behavioural.chainofresp;

public class AuthenticationMiddleWare extends Middleware {
	
    public AuthenticationMiddleWare(Server server) {
        this.server = server;
    }

    public String process(Request req) {
		System.out.println("Inside Authenticator");
        if (!server.hasEmail(req.getEmail())) {
            System.out.println("This email is not registered!");
            return server.getResponse(req);
        }
        if (!server.isValidPassword(req.getEmail(), req.getPassword())) {
            System.out.println("Wrong password!");
            return server.getResponse(req);
        }
        return checkNext(req);
    }
}
