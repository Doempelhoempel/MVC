package mvc2;

public class View2 implements IModelListener2{
	private int changeNr = 0;
	
	@Override
	public void onModelChanged(int newValue) {
		System.out.println("Aenderung "+ ++changeNr + ": "+newValue);
	}
}
