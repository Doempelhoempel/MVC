package mvc1;

public interface IViewableModel {
	int getValue();
	void addModelListener(IModelListener listener);
	boolean removeModelListener(IModelListener listener);
}
