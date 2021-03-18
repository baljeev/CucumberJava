package StepDefinitions;

import io.cucumber.java.en.*;

public class uberBookingSteps {
	@Given("User want to select a car type {string} from uber application")
	public void user_want_to_select_a_car_type_from_uber_application(String carType) {
	   System.out.println("Step1 :" + carType);
	}

	@When("User selects car {string} and pick up point {string} and drop of point {string}")
	public void user_selects_car_and_pick_up_point_and_drop_of_point(String carType, String PickupLocation, String DropofLocation) {
	    System.out.println("Step2:" + carType + "  " + PickupLocation + "  " +  DropofLocation );
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step3");
	    
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	 System.out.println("Step4");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer Price) {
	   System.out.println("Step5 :" + Price);
	}


}
