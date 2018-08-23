package us.aw;

/**
 * Created by mgreen14 on 12/27/17.
 */

/** The Cat class shows how many mice it has killed and to give the cat a name.
 *  Super(name) is used to interact with a different class to give the cat it's name
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * @return returns the number of mice the cat has killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    public void addMouse() {
        mousesKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

