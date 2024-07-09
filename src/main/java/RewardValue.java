public class RewardValue{
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_VALUE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_VALUE;
    }
    public RewardValue(double milesValue, boolean isMiles){
        if (isMiles){
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_VALUE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = (int) (milesValue / MILES_TO_CASH_VALUE);
        }
    }
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    public static void main(String [] args){
        RewardValue rewardCash = new RewardValue(100.0);
        System.out.println(rewardCash.getCashValue());
        System.out.println(rewardCash.getMilesValue());

        RewardValue rewardMiles = new RewardValue(100.0);
        System.out.println(rewardMiles.getCashValue());
        System.out.println(rewardMiles.getMilesValue());
    }

}
