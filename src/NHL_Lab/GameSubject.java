//---------- GameSubject.java ----------------

package NHL_Lab;

public interface GameSubject {

	public void addObserver(GameObserver gameObserver);
	public void removeObserver(GameObserver gameObserver);
	public void doNotify();
}
