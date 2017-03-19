package mvc1;

/**
 * controller class
 *
 */
public class Controller {
	private Model model;
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void changeModel(int newValue){
		this.model.setValue(newValue);
	}
}
