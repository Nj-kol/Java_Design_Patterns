package com.njkol.designpatterrns.behavioural.chainofresp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCOR {

	private Server server;

	@BeforeEach
	public void createfakeData() {
		server = new Server();
		server.register("admin@example.com", "admin_pass");
		server.register("user@example.com", "user_pass");
	}

	@Test
	public void testCORForSuccess() {

		// Define the handlers
		Middleware throttler = new ThrottlingMiddleware(2, server);
		Middleware authenticator = new AuthenticationMiddleWare(server);
		Middleware authorizor = new AuthorizationMiddleware(server);

		// Wire all the handlers
		throttler.linkWith(authenticator).linkWith(authorizor);

		// Server gets a chain from client code.
		server.setMiddleware(throttler);

		Request admin = new Request("admin@example.com", "admin_pass", "pageA");
		Request client = new Request("user@example.com", "user_pass", "pageB");
		
		System.out.println(server.handleRequest(admin));
		System.out.println(server.handleRequest(client));
		System.out.println("============================");
	}

	//@Test
	public void testCORForAuthenticationFailure() {

		// Define the handlers
		Middleware throttler = new ThrottlingMiddleware(2, server);
		Middleware authenticator = new AuthenticationMiddleWare(server);
		Middleware authorizor = new AuthorizationMiddleware(server);

		// Wire all the handlers
		throttler.linkWith(authenticator).linkWith(authorizor);

		// Server gets a chain from client code.
		server.setMiddleware(throttler);

		Request request = new Request("user@example.com", "dsds", "pageB");

		System.out.println(server.handleRequest(request));
		System.out.println("============================");
	}

	@Test
	public void testCORForAuthorizationFailure() {

		// Define the handlers
		Middleware throttler = new ThrottlingMiddleware(2, server);
		Middleware authenticator = new AuthenticationMiddleWare(server);
		Middleware authorizor = new AuthorizationMiddleware(server);

		// Wire all the handlers
		throttler.linkWith(authenticator).linkWith(authorizor);

		// Server gets a chain from client code.
		server.setMiddleware(throttler);
		
		Request request = new Request("user@example.com", "user_pass","pageA");

		System.out.println(server.handleRequest(request));
		System.out.println("============================");
	}

}
