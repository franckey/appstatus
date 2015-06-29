package net.sf.appstatus.services;


public class CallStatistics {
	
	private Long maxResponseTime;
	private double avgResponseTime = 0;
	private long failures = 0;
	private long errors = 0;
	private long hits = 0;
	private Long minResponseTime;
	private double avgNestedCalls = 0;


	public Long getMaxResponseTime() {
		return maxResponseTime;
	}


	public double getAvgResponseTime() {
		return avgResponseTime;
	}


	public long getFailures() {
		return failures;
	}


	public long getErrors() {
		return errors;
	}


	public long getHits() {
		return hits;
	}


	public Long getMinResponseTime() {
		return minResponseTime;
	}


	/**
	 * @return the avgNestedCalls
	 */
	public double getAvgNestedCalls() {
		return avgNestedCalls;
	}


	public  void addCall(Long executionTime, boolean failure, boolean error, int nestedCalls) {
		synchronized( this){
		hits++;
		if (failure) {
			failures++;
		}

		if (error) {
			errors++;
		}

		

			if (maxResponseTime == null || maxResponseTime < executionTime) {
				maxResponseTime = executionTime;
			}

			if (minResponseTime == null || minResponseTime > executionTime) {
				minResponseTime = executionTime;
			}

			avgResponseTime = (avgResponseTime * (hits - 1) + executionTime) / (hits);

			avgNestedCalls = (avgNestedCalls * (hits - 1) + (double) nestedCalls) / hits;
		}
		
	}
}