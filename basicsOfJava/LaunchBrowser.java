package basicsOfJava;

public class LaunchBrowser {
	public void launchBrowser() {
		System.out.println("Browser Launched Successfully");
	}
	
	public void loadurl() {
		System.out.println("Application URL loaded Successfully");
	}
	
	public static void main(String[] args) {
		LaunchBrowser launch = new LaunchBrowser();
		launch.launchBrowser();
		launch.loadurl();
	
	}
	

}
