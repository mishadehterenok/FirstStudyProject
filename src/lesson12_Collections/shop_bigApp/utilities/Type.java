package lesson12_Collections.shop_bigApp.utilities;

public enum Type {
    BEST_SELLER(10),
    REGULAR(0),
    SPECIAL(5);
    private int value;

    Type(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
