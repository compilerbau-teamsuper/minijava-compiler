class FullArray {
    int length = 3;
    int[] array = new int[length];

    int setElement(int index, int newValue) {
        return array[index] = newValue;
    }

    int getElement(int index) {
        return array[index];
    }

    int sum() {
        int sum = 0;
        for(int i = 0; i < length; i++) {
            sum += array[i];
        }
        return sum;
    }
}