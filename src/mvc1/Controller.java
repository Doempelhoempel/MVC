package mvc1;

public class Controller {
	private Model model;
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void changeModel(int newValue){
		this.model.setValue(newValue);
	}
}
