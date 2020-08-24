package zw.co.clouddynamics.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User {
	@GetMapping("/schools")
	String getSchools()
	{
		return "School Cups";
	}

}
