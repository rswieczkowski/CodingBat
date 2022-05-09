package pl.recursion_2;

public class FindGoldBox {

    public static boolean findGoldBox(int index, String[] boxes) {
        if(index == boxes.length) {
            return false;
        }

        if(boxes[index].equals("gold")) {
            return true;
        } else {
            return findGoldBox(index + 1, boxes);
        }
    }

    public static void main(String[] args) {
        String[] boxes = {"silver", "brown", "white", "gold"};

        System.out.println(findGoldBox(0, boxes));
    }

}
