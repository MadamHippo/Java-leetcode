class Result {

    /*
    Compliance Crawler Directory Reset
    
     * Complete the 'minimumSteps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts an Array(List) of Strings loggedMoves as parameter.
     
     Also named...minimum-number-of-operations-required-to-return-to-the-root-folder
     
     */

    public static int minimumSteps(List<String> loggedMoves) {
    // Approach: The problem can be solved using Stack. Follow the steps below to solve the problem:
    

    // .equal means..do they have the same value. Do the object holds the same value.
    // == means do they point to the same instances.
    
    int minMoves = 0;
    
    Stack<String> stackie = new Stack<String>();
    
    for (int i = 0; i < loggedMoves.size(); i++){
        if (loggedMoves.get(i).equals("../") && !stackie.isEmpty()){
            stackie.pop();
            minMoves--;
        } else if (loggedMoves.get(i).equals("./")) {
            continue;
        } else {
            stackie.push(loggedMoves.get(i));
            minMoves++;
        }
    }
    return minMoves;

    }

}
