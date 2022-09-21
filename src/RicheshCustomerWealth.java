public class RicheshCustomerWealth {
    public int getMaximumWealth(int [][] accounts){
        int max = 0;
        for (int[] temp_arr : accounts) {
            int temp_max = 0;
            for (int k : temp_arr) {
                temp_max += k;
            }
            if (max <= temp_max){
                max = temp_max;
            }
        }
        return max;
    }

    public static void main(String[] args){
        RicheshCustomerWealth Sol = new RicheshCustomerWealth();
        int[][] values = {{1, 2, 3, 1, 2}, {1,1,1,6, 2}, {1, 3, 4, 5, 6}};
        System.out.println(Sol.getMaximumWealth(values));
    }
}
