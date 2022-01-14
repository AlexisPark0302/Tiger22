package sampleCode.Arrays;

public class EphrataTemp {

    private static String Below;

    public static void main(String[] args) {

        int[] hightemp = {26, 43, 28, 30};

        int sum = 0;
        int count = 0;

        // Calculate Sum, Count, and Average Temperature

        for (int t = 0; t < hightemp.length; t++) {        
            sum += hightemp[t];
            count++;
            //System.out.println(count);
        }

        double averageTemp = (double)sum / count;

        System.out.println("Average Daily Temperature: " + averageTemp);

        // Count and print out the number of days the temperature was below the average temperature

            for (int t = 0; t < hightemp.length; t++){
                if(hightemp[t] < averageTemp){
                    
                }
            }
            System.out.println("Temperatures Below" + Below);



        // Using a For-Each Loop Count and print out the number of days the temperature was above the average temperature


        
        

    }

}
