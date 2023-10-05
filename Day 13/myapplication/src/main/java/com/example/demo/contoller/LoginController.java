package com.example.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoginModel;
import com.example.demo.service.LoginServices;

import lombok.RequiredArgsConstructor;


@RestController
@CrossOrigin("*")
public class LoginController {
		@Autowired
		private LoginServices mn;
		
	    @GetMapping("/getlogin")
		public List<LoginModel> getdetail() {
			return mn.getdatas();
		}	
	    @PostMapping("/savelogin")
		public void saveDetails(@RequestBody LoginModel kp) {
			mn.saveData(kp);
		}

		@PutMapping("/updatelogin")
		public void updateDetails(@RequestBody LoginModel kp, @RequestParam int id) {
			kp.setId(id);
			mn.updateData(kp);
		}

		@DeleteMapping("/deletelogin")
		public void deleteDetails(@RequestParam int id) {
			mn.deleteData(id);
		}
		@RequiredArgsConstructor
		@Tag(name = "Authentication")
		public class AuthenticationController {

		    private final AuthService authService;

		    @PostMapping("/register")
		    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
		        boolean isRegistered = authService.userRegistration(request);
		        return isRegistered ? ResponseEntity.ok("User registered successfully")
		                : ResponseEntity.badRequest().body("Sommething went wrong!");
		    }

		    @PostMapping("/login")
		    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
		        return ResponseEntity.ok(authService.userAuthentication(request));
		    }
		}
	    
	}


