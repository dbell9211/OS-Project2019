//import packagename pcb.
//import packagename memory. 
//import packagename cpu.
//import packagename scheduler.
//import packagename Driver.
import java.util.*;

public class Dispatcher {
   private int CPU[];
   private int cpus[]; 
   
   Dispatcher (int CPU []) {
      this.cpus = cpus;
   }
   
   public void dispatch_2() {//dispatcher sets the cpu process and then loads in the pcb through context switching. 
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
}//end class
