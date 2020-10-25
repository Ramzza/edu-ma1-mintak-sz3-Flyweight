package flyweight;

public interface Glyph {
    public void draw(Window w, GlyphContext gc);
    public void setFont(Font f, GlyphContext gc);
    public Font getFont(GlyphContext gc);
    public void first(GlyphContext gc);
    public void next(GlyphContext gc);
    public boolean isDone(GlyphContext gc);
    public Glyph current(GlyphContext gc);
    public void insert(Glyph g, GlyphContext gc);
    public void remove(GlyphContext gc);
}
