import java.util.Date;
public class TestStopWatch {
    public static void main(String[] args) {

        double startTime = new Date().getTime();
        System.out.println("StartTime: " + startTime);

        for(int i = 0; i <= 1000; i++){
            System.out.println("i: " + i);
        }
        double endTime = new Date().getTime();
        System.out.println("EndTime: " + endTime);
        StopWatch stopWatch = new StopWatch(startTime, endTime);
        System.out.println("ElapsedTime: " + stopWatch.getElapsedTime());

    }
}
