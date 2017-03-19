package mvc2;

import java.util.ArrayList;

public class Model2 {
	private int value;
	private ArrayList<IModelListener2> listeners;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		notifyListeners(); //Listeners benachrichtigen
	}

	public Model2() {
		this.value = 42;
		this.listeners = new ArrayList<IModelListener2>();
	}

	private void notifyListeners() {
		for (IModelListener2 listener : listeners) {
			listener.onModelChanged(this.value);
		}
	}
	
	public void addModelListener(IModelListener2 listener){
		this.listeners.add(listener);
	}
	
	public boolean removeModelListener(IModelListener2 listener){
		return this.listeners.remove(listener);
	}
}
