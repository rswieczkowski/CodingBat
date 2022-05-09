package pl.ap_1;

public class UserCompare {

    public int userCompare(String aName, int aId, String bName, int bId) {


        if (aName.compareTo(bName) < 0) {
            return -1;

        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else {
            if (aName.equals(bName)) {
                if (aId > bId) {
                    return 1;
                } else if (bId > aId) {
                    return -1;
                }
            }
        }
        return 0;
    }

}
