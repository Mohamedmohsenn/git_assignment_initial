public class MultiplicationSeries implements ISubscriber
{
    public  void notifySubscriber(int input)
    {
        int result = mult(input);
        System.out.println("The result of multiplication series is "+ result);
    }
    int mult(int n)
    {
    	int result = 1;
    	while(n!=1){
    		result = result * n--;
    	}
    	return result;
    }


}
