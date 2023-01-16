package edu.java.mvc.view;

public enum Menu {
    QUIT, CREATE, SELECT_ALL, SELECT_BY_INDEX, UPDATE, UNKNOWN;

    // int를 Menu 타입으로 변경하는 메서드

    public static Menu getValue(int n) {
        Menu[] array = values(); // 모든 enum 타입에는 values가 있음.
        int lastIndex = array.length - 1;
        if (n >= 0 && n < lastIndex) {
            return array[n];
        } else {
            return array[lastIndex];
        }

    }

}
