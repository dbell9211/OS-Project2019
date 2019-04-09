import java.util.List;

public class Scheduler implements Runnable {

	private Memory disk;
	private PCB pcb;
	private CPUSchedulingPolicy schedulingMethod;
   public LinkedList<String> readyqueue = new LinkedList<String>();
   public LinkedList<int> Jobqueue = new LinkedList<int>();
   public LinkedList<> List = new LinkedList<>();

	Scheduler( Memory disk, PCB pcb, SchedulingProcess schedulingMethod ) {

		this.PCB = pcb;
		this.disk = disk;
		this.schedulingMethod = schedulingMethod;
	}

	@Override public void run() {
		// Remove terminated processes from the RAM
		for (PCB pcb : this.pcb) {
			if (pcb.Status == PCB.Status.BLOCKED) {
				try {
					for ( int x = 0; x < disk.read(); x++ ) {
						this.disk.write(pcb.getStartDiskAddress());
					}
				} catch ( InvalidAddressException e ) {
					// Do nothing, process has already been removed
				}
			}
		}


		// Find next process
		if ( jobqueue.size() > 0 ) {
			PCB = list.get( 0 );
			if ( this.schedulingMethod == SchedulingPolicy.Priority ) {
				//Find highest priority process
				for ( PCB pcb : list ) {
					if ( next.getPriority() < pcb.getPriority() ) {
						 //psedo code here. moves to next pcb.maybe change list parameters?
					}
				}
			} else if ( this.schedulingMethod == SchedulingPolicy.FCFS ) {
				// Find the next loaded process
			   list.get( 0 );
			}
            ReadyQueue().add(pcb);//pseudo coded.
				pcb.Status == PCB.Status.READY;
			}
		}
	}
