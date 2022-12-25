// Calculate the sum of an array of integers.

// HINT: hackerrank is silly, it says array of integers but it's a LIST!!!! xD


class Result {

    /*
     * Complete the 'arraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int arraySum(List<Integer> numbers) {
    // Write your code here
    int sum = 0;
    
    for (int i = 0; i<numbers.size(); i++)
    {
        sum+=numbers.get(i);
    }
    return sum;
    
    }

}

/*
Another way is using for each loop, which is probably better for this!!!

class Result {

    public static int arraySum(List<Integer> numbers) {
    // Write your code here
    int sum = 0;
    
    for (int digit : numbers){
        sum+=digit;
    }
    return sum;
    
    }

}
*/
