public class BmiService {
    public int calculate(double h, int m){
        int result;
        if (h > 0){
            result = (int) (m / (h * h));
        } else {
            result = 0;
        }
        return result;
    }
}
