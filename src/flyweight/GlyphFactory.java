package flyweight;

public class GlyphFactory {
    public static final int NCHARCODES = 128;

    private Character[] characters;

    public GlyphFactory() {
        for (int i = 0; i < NCHARCODES; i++) {
            this.characters[i] = null;
        }
    }

    public Character createCharacter(char c) {
        if (this.characters[c] != null) {
            this.characters[c] = new Character(c);
        }
        return this.characters[c];
    }

    public Row createRow() {
        return new Row();
    }

    public Column createColumn() {
        return new Column();
    }
}
