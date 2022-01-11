package com.njkol.designpatterrns.behavioural.chainofresp;

/**
 * ConcreteHandler. Checks whether there are too many failed login requests.
 */
public class ThrottlingMiddleware extends Middleware {

	private int requestPerMinute;
	private int request;
	private long currentTime;

	public ThrottlingMiddleware(int requestPerMinute, Server server) {
		this.requestPerMinute = requestPerMinute;
		this.currentTime = System.currentTimeMillis();
		this.server = server;
	}

	/**
	 * Please, not that checkNext() call can be inserted both in the beginning of
	 * this method and in the end.
	 *
	 * This gives much more flexibility than a simple loop over all middleware
	 * objects. For instance, an element of a chain can change the order of checks
	 * by running its check after all other checks.
	 */
	@Override
	public String process(Request req) {
		System.out.println("Inside throttler");
		if (System.currentTimeMillis() > currentTime + 60_000) {
			request = 0;
			currentTime = System.currentTimeMillis();
		}
		request++;

		if (request > requestPerMinute) {
			System.out.println("Request limit exceeded!");
			Thread.currentThread().stop();
		}
		return checkNext(req);
	}
}