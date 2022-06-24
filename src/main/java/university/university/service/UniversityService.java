package university.university.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import university.university.entity.University;
import university.university.repository.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepository repository;
	
	public University saveUniversity(University university) {
	return repository.save(university);
	}
	
	public List<University> saveUniversity(List<University> Universitys){
	 return repository.saveAll(Universitys);
	 }
	

	public University getuniversityById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse( null);
	}
	
	
	
	}

