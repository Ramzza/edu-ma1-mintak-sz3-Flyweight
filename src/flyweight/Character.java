package flyweight;

public class Character implements Glyph {
    private char charCode;

    public Character(char c){
        this.charCode = c;
    }


    @Override
    public void draw(Window w, GlyphContext gc) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setFont(Font f, GlyphContext gc) {
        // TODO Auto-generated method stub

    }

    @Override
    public Font getFont(GlyphContext gc) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void first(GlyphContext gc) {
        // TODO Auto-generated method stub

    }

    @Override
    public void next(GlyphContext gc) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isDone(GlyphContext gc) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Glyph current(GlyphContext gc) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Glyph g, GlyphContext gc) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(GlyphContext gc) {
        // TODO Auto-generated method stub

    }
    
}
