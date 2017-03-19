package mvc2;

import mvc1.*;

public class Controller2  {
	private Model2 model;
	private View2 view;
	
	public Controller2(Model2 model, View2 view) {
		this.model = model;
		this.view = view;
		model.addModelListener(this.view);
	}
	
	public void changeModel(int newValue){
		this.model.setValue(newValue);
	}


}
