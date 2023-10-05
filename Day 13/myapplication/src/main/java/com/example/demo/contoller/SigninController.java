
package com.example.demo.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SigninModel;
import com.example.demo.service.SigninServices;


@RestController
@CrossOrigin("*")
public class SigninController {
	
	
	@Autowired
	private SigninServices as;
	
    @GetMapping("/gets")
	public List<SigninModel> getdetail() {
		return as.getdatas();
	}	
    @PostMapping("/savepass")
	public void saveDetails(@RequestBody SigninModel Ie) {
		as.saveDatass(Ie);
	}

	@PutMapping("/updatepass")
	public void updateDetails(@RequestBody SigninModel Ie, @RequestParam int id) {
		Ie.setId(id);
		as.updateDatass(Ie);
	}

	@DeleteMapping("/deletepass")
	public void deleteDetails(@RequestParam int id) {
		as.deleteDatass(id);
	}
    
}

