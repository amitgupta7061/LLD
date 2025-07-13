package oops;


public class dataclass {

    static class StatData{
        private double average;
        private double median;
        private int min;
        private int max;

        StatData(double average, double median, int min, int max){
            this.average = average;
            this.median  = median;
            this.min     = min;
            this.max     = max;
        }

        public void display() {
            System.out.println("Average: " + average);
            System.out.println("Median: " + median);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
        
    }

    public static StatData calculate_data(int[] nums){

        double average = 0, median = 0;
        int min = 0, max = 0;

        // some operations

        return new StatData(average, median, min, max);
        
    }
    public static void main(String[] args) {
        
    }
}
