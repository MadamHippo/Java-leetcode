class Result {

    /*
     * Complete the 'minTime' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY batchSize
     *  2. INTEGER_ARRAY processingTime
     *  3. INTEGER_ARRAY numTasks
     
     This problem required some casting of types (doubles/floats/long etc.)
     
     There is a divide by 0 error in there which needs a Math.ceil to get around:
          
     A bit of black magic, and you can do it all with integers:

        Divide x by n rounding up
        int res = (x+n-1)/n

    To convert floor division to ceiling division:

        (numerator + denominator-1) / denominator
    
    To convert floor division to rounding division:

        (numerator + (denominator)/2) / denominator
    
     */

    public static long minTime(List<Integer> batchSize, List<Integer> processingTime, List<Integer> numTasks) {
    // Write your code here
    
    double time = 0.0;
    
    for (int i = 0; i < batchSize.size(); i++){
        double tempTime = (Math.ceil(numTasks.get(i)/(double)batchSize.get(i))) * processingTime.get(i);
        time = Math.max(tempTime, time);
    }
 
    return (long)time;

    }

}
