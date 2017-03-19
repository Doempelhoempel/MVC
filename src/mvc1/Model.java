package mvc1;

import java.util.ArrayList;

public class Model implements IViewableModel {
	private int value;
	private ArrayList<IModelListener> listeners;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyListeners(); //Listeners benachrichtigen
	}

	public Model() {
		this.value = 42;
		this.listeners = new ArrayList<IModelListener>();
	}

	private void notifyListeners() {
		for (IModelListener listener : listeners) {
			listener.onModelChanged();
		}
	}
	
	public void addModelListener(IModelListener listener){
		this.listeners.add(listener);
	}
	
	public boolean removeModelListener(IModelListener listener){
		return this.listeners.remove(listener);
	}
	

}
