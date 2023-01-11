import java.util.*;

interface Sport{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}

class Cricket implements Sport{

    // variable fields...
    private int[] playerIDs;

    // constructor:
    Cricket(){
        playerIDs = new int[11];
        Arrays.fill(playerIDs, 1);
        System.out.println("A new cricket team has been formed");
    }

    // methods:
    public void calculateAvgAge(int[] age){
        double teamSum = 0.0;
        for (int i : age) {
            teamSum+=i;
        }
        double avgAge = teamSum/age.length;
        System.out.printf("The average age of the team is %.2f%n", avgAge);
    }

    public void retirePlayer(int id) {
        if (playerIDs[id-1]==-1) {
            System.out.println("Player has already retired");
        } else {
            playerIDs[id-1] = -1;
            System.out.printf("Player with id: %d has retired %n", id);
        }
    }
}

class Football implements Sport {
    int[] playerIDs;

    Football(){
        playerIDs = new int[11];
        Arrays.fill(playerIDs, 1);
        System.out.println("A new football team has been formed");
    }
    public void calculateAvgAge(int[] age){
        double teamSum = 0.0;
        for (int i : age){
            teamSum+=i;
        }
        double avgAge = teamSum/age.length;
        System.out.printf("The average age of the team is %.2f%n", avgAge);
    }

    public void retirePlayer(int id){
        if (playerIDs[id-1] == -1){
            System.out.println("Player has already retired");
        } else {
            playerIDs[id-1] = -1;
            System.out.printf("Player with id: %d has retired %n", id);
        }
    }

    public void playerTransfer(int fee, int id) {
        if (playerIDs[id-1] == -1){
            System.out.println("Player has already retired");
        }
        else if (playerIDs[id-1] == 1) {
            System.out.printf("Player with id: %d has been transferred with a fee of %s", id, fee);
        }
    }
}
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for(int i = 0; i < 6; i++){

            if(i < 3){
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            }
            else if(i < 5){
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            }
            else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
    }
}
