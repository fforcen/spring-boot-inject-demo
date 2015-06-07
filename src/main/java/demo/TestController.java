package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired()
	@Qualifier("city1")
	Catalog myCatalog1;
	
	@Autowired()
	@Qualifier("city2")
	Catalog myCatalog2;
	
	@RequestMapping(value="/city1",method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Catalog> TestGet1()
	{		
		return new ResponseEntity<Catalog>(myCatalog1, HttpStatus.OK);
	
	}
	
	@RequestMapping(value="/city2",method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Catalog> TestGet2()
	{		
		return new ResponseEntity<Catalog>(myCatalog2, HttpStatus.OK);
	
	}
}
