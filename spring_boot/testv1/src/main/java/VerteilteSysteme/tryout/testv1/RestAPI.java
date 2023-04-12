package VerteilteSysteme.tryout.testv1;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestAPI{
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String getTestString(){
		return "This is a successful test!";
	}
}