import java.util.Date;

public class StopWatch {
    private Date startTime ,endTime ;
    public StopWatch()
    {

    }
    public  Date getStartTime()
    {
        return this.startTime;
    }
    public  Date getEndTime()
    {
        return this.endTime;
    }
    public void Start()
    {
        this.startTime=new Date();
    }
    public  void Stop()
    {
        this.endTime=new Date();
    }
    public double getElapsedTime() {
        return getEndTime().getTime()-getStartTime().getTime();
    }

    public static void main(String[] args) {
        double[] array=new double[100000];
        for(int i=0;i<100000;i++)
        {
            array[i]=Math.floor(Math.random()*100000);
        }
        StopWatch stopWatch=new StopWatch();
        stopWatch.Start();
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                    double temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        stopWatch.Stop();
        System.out.println("Thoi gian thuc hien " +stopWatch.getElapsedTime()+" milisecond ");
    }
}
