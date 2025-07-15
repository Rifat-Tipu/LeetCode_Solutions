class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
       int i=0,j=0;
       int cnt=0;
       while(players.length>i && trainers.length>j)
       {
        if(players[i]<=trainers[j])
        {
            cnt++;
            i++;
        }
        j++;
       }
       return cnt;
    }
}
