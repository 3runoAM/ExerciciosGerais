public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p){
        int countYears = 0;
        percent/=100;
        while (p0 < p){
            p0 = (int) (p0 + p0 * percent + aug);
            countYears++;
        }
        return countYears;
    }
}
