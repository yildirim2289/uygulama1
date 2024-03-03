public class RunnerHelper {
    public static int findFirstPlaceIndex(Runner[] runners){
        int minTime = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0;i< runners.length;i++){
            if(runners[i].getTime()<minTime){
                minTime = runners[i].getTime();
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findSecondPlaceIndex(Runner[] runners, int excludeIndex){
        int minTime = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0;i<runners.length;i++){
            if(i != excludeIndex && runners[i].getTime() < minTime){
                minTime = runners[i].getTime();
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findThirdPlaceIndex(Runner[] runners, int excludeIndex1 , int excludeIndex2){
        int minTime = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0;i< runners.length;i++){
            if(i != excludeIndex1 && i != excludeIndex2 && runners[i].getTime() < minTime){
                minTime = runners[i].getTime();
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void classifyStudents(Runner[] runners){
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        for (Runner runner : runners){
            if(runner.getTime()>=200 && runner.getTime()<=299){
                aCount++;
            }else if(runner.getTime()>=300 && runner.getTime()<=399){
                bCount++;
            }else{
                cCount++;
            }
        }
        System.out.println("A --> " + aCount);
        System.out.println("B --> " + bCount);
        System.out.println("c --> " + cCount);
    }
}
