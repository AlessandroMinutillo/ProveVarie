package Controller;

import Model.Metadata;

import Database.DatabaseClass;

import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/metadata")
	public Vector<Metadata> getMetadata(){
		return DatabaseClass.getVectorMetadata();
	}
}
