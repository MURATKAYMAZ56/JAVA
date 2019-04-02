import java.util.ArrayList;

public abstract class BoardAbstract {

	ArrayList<String> spots;

	public BoardAbstract() {
        this.spots = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(String.valueOf(i));
        }
    }

	public abstract void add();


}
