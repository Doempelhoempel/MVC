package mvc2;



public class RunMVC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model2 model = new Model2();
		View2 view = new View2();
		Controller2 controller = new Controller2(model, view);
		
		controller.changeModel(1);
		controller.changeModel(2);
		controller.changeModel(3);
	}

}
