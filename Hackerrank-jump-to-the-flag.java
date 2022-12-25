class Result {

    /*
     * Complete the 'jumps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER flagHeight
     *  2. INTEGER bigJump
     */

    public static int jumps(int flagHeight, int bigJump) {
    // Write your code here
    
    int num_of_jumps = 0;
    
    while (flagHeight != 0){
        
        if (flagHeight < bigJump){
            flagHeight --;
            num_of_jumps ++;
        } else {
            flagHeight -= bigJump;
            num_of_jumps++;
        }
    }
    return num_of_jumps;
    
    }

}
