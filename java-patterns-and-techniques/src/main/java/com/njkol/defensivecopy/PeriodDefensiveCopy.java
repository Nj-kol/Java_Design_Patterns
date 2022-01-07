package com.njkol.defensivecopy;

import java.util.Date;

public final class PeriodDefensiveCopy {

	private final Date start;
	private final Date end;

	/**
	 * @param start the beginning of the period
	 * @param end   the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException     if start or end is null
	 */
	public PeriodDefensiveCopy(Date start, Date end) {
		// Repaired constructor - makes defensive copies of parameters
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
	}

	// Repaired accessors - make defensive copies of internal fields
	public Date start() {
		return new Date(start.getTime());
	}

	public Date end() {
		return new Date(end.getTime());
	}
	// Remainder omitted
}