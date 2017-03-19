package mvc1;

public class View implements IModelListener {
	private IViewableModel model;
	private int changeNr = 0;;
	
	public View(IViewableModel model) {
		this.model = model;
		model.addModelListener(this);
	}

	@Override
	public void onModelChanged() {
		System.out.println("Aenderung "+ ++changeNr + ": "+model.getValue());
	}

}
