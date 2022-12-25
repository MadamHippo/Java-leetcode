class Result {

    /*
     * Complete the 'addNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. FLOAT a
     *  2. FLOAT b
     */

    public static int addNumbers(float a, float b) {
        
      // 1 way:
        float c = a + b;
        int answer = (int)c;
        return answer;
       
      
      // another way: 
         float sum = Float.sum(a, b);
         return (int)sum;
      
        }
}
