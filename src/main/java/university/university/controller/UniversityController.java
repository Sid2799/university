package university.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import university.university.entity.University;
import university.university.service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService service;
	
	
	@PostMapping("/addUniversity")
	public University addUniversity(@RequestBody University university) {
		return service.saveUniversity(university);
	}
	@PostMapping("/addUniversitys")
	public List<University> addUniversity(@RequestBody  List<University> universitys) {
		return service.saveUniversity(universitys);
	}
	
/*@GetMapping("/universitys")
	public List<University> findAllUniversitys(){
		return service.getuniversitys();		
	}*/

	@GetMapping("/university/(id)")
 public University findUniversityById(int id) {
	 return service.getuniversityById(id);
 }
}
