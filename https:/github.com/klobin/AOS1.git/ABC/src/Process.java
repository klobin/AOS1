
public class Process implements Comparable<Process>{
	long arrivalTime;
	long runTime;
	int priority;

	public Process(long arrivalTime, long runTime, int priority) {
		super();
		this.arrivalTime = arrivalTime;
		this.runTime = runTime;
		this.priority = priority;
	}

	@Override
	public int compareTo(Process o) {
		if(this.arrivalTime == o.arrivalTime) {
			return 0;
		}
		return  this.arrivalTime > o.arrivalTime ?  1: -1;
	}

}
