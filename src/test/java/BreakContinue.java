class BreakContinue {
    int loop() {
        int result = 0;
        for(int i = 0; i < 3; i++) {
            if (i == 0) {
                continue;
            } else if (i == 2) {
                break;
            }
            result += i;
        }
        return result;
    }
}