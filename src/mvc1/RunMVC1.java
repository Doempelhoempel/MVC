package mvc1;

public class RunMVC1 {

	public static void main(String[] args) {
		//View und Controller kennen Model
		//Nachteil: auch View kann theoretisch Model veraendern
		//Loesungsansatz: View kennt nur IViewableModel
		Model model = new Model();
		Controller controller = new Controller(model);
		View view = new View(model);
		
		
		controller.changeModel(11);
		controller.changeModel(22);
		controller.changeModel(33);
	}

}
