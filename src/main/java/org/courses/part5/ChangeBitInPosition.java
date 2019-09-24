package org.courses.part5;

public class ChangeBitInPosition {
    private ChangeBitForZero changeBitForZero;
    private ChangeBitForOne changeBitForOne;

    public ChangeBitInPosition(ChangeBitForZero changeBitForZero, ChangeBitForOne changeBitForOne) {
        this.changeBitForZero = changeBitForZero;
        this.changeBitForOne = changeBitForOne;
    }

    public ChangeBitInPosition() {
    }

    public ChangeBitForZero getChangeBitForZero() {
        return changeBitForZero;
    }

    public void setChangeBitForZero(ChangeBitForZero changeBitForZero) {
        this.changeBitForZero = changeBitForZero;
    }

    public ChangeBitForOne getChangeBitForOne() {
        return changeBitForOne;
    }

    public void setChangeBitForOne(ChangeBitForOne changeBitForOne) {
        this.changeBitForOne = changeBitForOne;
    }

    public ChangeBitInPosition(ChangeBitForOne changeBitForOne) {
        this.changeBitForOne = changeBitForOne;
    }

    public ChangeBitInPosition(ChangeBitForZero changeBitForZero) {
        this.changeBitForZero = changeBitForZero;
    }

    public static void main(String[] args) {
        int number = -1; //11000
        int position = 2;
        System.out.println(new ChangeBitInPosition(new ChangeBitForOne()).getNumberChangeZeroToOne(4, 0));
        System.out.println(new ChangeBitInPosition(new ChangeBitForZero()).getNumberChangeOneToZero(9, 0));

    }

    public int getNumberChangeZeroToOne(int number, int position) {
        return changeBitForOne.changeBitForOneInPosition(number, position);

    }

    public int getNumberChangeOneToZero(int number, int position) {
        return changeBitForZero.changeBitForZeroInPosition(number, position);
    }


}
