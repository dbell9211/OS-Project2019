public class PCB
{
   String State;
   int counter;
   int jobID;
   int priority;
   int startingAddress;
   
  
   enum State
   {
      RUNNING, READY, WAITING
   }
  

   //Setters and getters
   public void setJobID(int jobID)
   {
      this.jobID = jobID;
   }
   public void setPriority(int priority)
   {
      this.priority = priority;
   }
   public void setStartingAddress(int startingAddress)
   {
      this.startingAddress = startingAddress;
   }


   public int getJobID()
   {
     return this.jobID;
   }
   public int gePriority()
   {
     return this.priority;
   }
   public int getStartingAddress()
   {
     return this.startingAddress;
   }


   public PCB(String State, int counter, int jobID, int priority, int startingAddress )
   {
      this.State = State;
      this.counter = counter;
      this.jobID = jobID;
      this.priority = priority;
      this.startingAddress = startingAddress;

   }

}