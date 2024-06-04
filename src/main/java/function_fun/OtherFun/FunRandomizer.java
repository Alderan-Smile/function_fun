package function_fun.OtherFun;

/************************************************************************************************************
 * @author Oliver Consterla Araya                                                                           *
 * @version 202461.23.24                                                                                    *
 * @since 2024                                                                                              *
 ************************************************************************************************************/
public class FunRandomizer {

    /**
     * Generates a random integer between the specified minimum and maximum values (inclusive).
     *
     * @param min the minimum value of the range
     * @param max the maximum value of the range
     * @return a random integer between min and max (inclusive)
     */
    public Integer randomInt(Integer min, Integer max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Generates a random Long value between the specified minimum and maximum values (inclusive).
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (inclusive)
     * @return a random Long value between min and max
     */
    public Long randomLon(Long min, Long max){
        Random random = new Random();
        return min + (long) (random.nextDouble() * (max - min));
    }

    /**
     * Generates a random double value between the specified minimum and maximum values.
     *
     * @param min the minimum value (inclusive)
     * @param max the maximum value (exclusive)
     * @return a random double value between min (inclusive) and max (exclusive)
     */
    public Double randomDou(Double min, Double max){
        Random random = new Random();
        return min + (random.nextDouble() * (max - min));
    }
}
