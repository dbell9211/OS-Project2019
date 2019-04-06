package com.kennesaw.edu.os.dispatcher;
import com.kennesaw.edu.os.Driver;
import com.kennesaw.edu.os.cpu.CPU;

public class Dispatcher {
	private int CPU[]; 
	private int cpus[]; // why 2 ???? 

	public Dispatcher() {
		// TODO Auto-generated constructor stub
	}

	public Dispatcher (int CPU []) {
		this.cpus = cpus;
	}

	public void dispatch() {//dispatcher sets the cpu process and then loads in the pcb through context switching. 
		for (CPU cpu : this.cpus) {
			if ((cpu.getJob() == null || pcb.Status.RUNNING != cpu.getJob().getStatus())) {

				pcb.next();
				next = scheduler.getReadyQueue().remove();
				cpu.setProcess(next);
				RAM cache = cpu.getCache();
				for (int r = 0; r < next.getTotalSize() && r < cache.getCapacity(); r++ ) {
					cache.write(r, RAM.read(next, r));
					Driver.CPU[r].load(pcb);
				}
			}
		}
	}//end method
	
	
	public void setCpus(int[] cpus) {
		this.cpus = cpus;
	}
}//end class
