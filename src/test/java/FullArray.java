class FullArray {
    int[] array = new int[3];

    int setElement(int index, int newValue) {
        return array[index] = newValue;
    }

    int getElement(int index) {
        return array[index];
    }

    int sum() {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}