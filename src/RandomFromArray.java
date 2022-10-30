class RandomFromArray {
    private int[] extended_values;
    public RandomFromArray(int[] values, int[] weights) {

        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        extended_values = new int[sum];
        int cursor = 0;

        for(int i = 0; i < weights.length; i++){
            for(int j = 0; j < weights[i]; j++){
                extended_values[cursor++] = values[i];
            }
        }
    }

    public int getRandom() {
        int random = (int) Math.round(Math.random() * ( extended_values.length - 1));
        return extended_values[random];
    }
}