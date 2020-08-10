
public class StopWatch {
    private double startTime;
    private double endTime;

   public StopWatch() {
   }

   public StopWatch(double startTime, double endTime) {
         this.startTime= startTime;
         this.endTime = endTime;
   }

   public double getStartTime() {
        return startTime;
   }

   public  double getEndTime() {
       return endTime;
   }

   public double getElapsedTime() {
       return endTime - startTime;
   }
}

