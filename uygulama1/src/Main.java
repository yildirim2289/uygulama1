
public class Main {
    public static void main(String[] args) {
        Runner[] runners = {
                new Runner ("Kadir",341),
                new Runner ("Gökhan",273),
                new Runner ("Hakan",278),
                new Runner ("Suzan",329),
                new Runner ("Pınar",445),
                new Runner ("Mehmet",402),
                new Runner ("Ali",388),
                new Runner ("Emel",270),
                new Runner ("Fırat",243),
                new Runner ("James",334),
                new Runner ("Jale",412),
                new Runner ("Ersin",393),
                new Runner ("Deniz",299),
                new Runner ("Gözde",343),
                new Runner ("Anıl",317),
                new Runner ("Burak",265),
        };
       int firstPlaceIndex = RunnerHelper.findFirstPlaceIndex(runners);
       System.out.println("Birinci en iyi koşucu: " + runners[firstPlaceIndex].getName() +
               ", zaman: " + runners[firstPlaceIndex].getTime());
       int secondPlaceIndex = RunnerHelper.findSecondPlaceIndex(runners, firstPlaceIndex);
       System.out.println("İkinci en iyi koşucu: " + runners[secondPlaceIndex].getName() +
               ",zaman: " + runners[secondPlaceIndex].getTime());
       int thirdPlaceIndex = RunnerHelper.findThirdPlaceIndex(runners, firstPlaceIndex,secondPlaceIndex);
       System.out.println("Üçüncü en iyi koşucu: " + runners[thirdPlaceIndex].getName() +
               ",zaman: " + runners[thirdPlaceIndex].getTime());
       RunnerHelper.classifyStudents(runners);

    }
}