class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String startT[]=startTime.split(":");
        String endT[]=endTime.split(":");

   int start = Integer.parseInt(startT[0]) * 3600 
                  + Integer.parseInt(startT[1]) * 60 
                  + Integer.parseInt(startT[2]); 
                  
        int end = Integer.parseInt(endT[0]) * 3600 
                + Integer.parseInt(endT[1]) * 60 
                + Integer.parseInt(endT[2]); 




        return end-start;
    }
}