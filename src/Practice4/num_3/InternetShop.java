package Practice4.num_3;

public enum InternetShop {
    OUTERWEAR, PANTS, UNDERCLOTHES;
    public enum outerwear {
        JACKETS(70), RAINCOATS(50), DOWNJACKETS(100);
        final int price;
        outerwear(int price) {this.price = price;}
    }
    public enum pants {
        JEANS(30), SKINNY(30), WIDE(30);
        final int price;
        pants(int price) {this.price = price;}
    }
    public enum underclothes {
        UNDERPANTS(10), BRASSIERE(7);
        final int price;
        underclothes(int price) {this.price = price;}
    }
}


