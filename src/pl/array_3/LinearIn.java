package pl.array_3;

public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {

        int counter = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    counter++;
                    break;
                }
            }
        }
        return counter == inner.length;
    }

}
