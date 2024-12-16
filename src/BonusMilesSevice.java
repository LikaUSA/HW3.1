class BonusMilesService {
    public. int calculate (int price) {
        int result;
        if (price > 19) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
