package ch.logixisland.anuto.game.render;

public class StaticSprite extends SpriteInstance {

    private int mIndex;

    StaticSprite(int layer, SpriteTemplate template) {
        super(layer, template);
    }

    public void setIndex(int index) {
        mIndex = index;
    }

    @Override
    int getIndex() {
        return mIndex;
    }

}
