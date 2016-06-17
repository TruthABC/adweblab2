package lab2.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;

import lab2.support.Place;  
  
@RestController  
public class PlaceController {  
  
	//http://localhost:8080/place/复旦大学
    @RequestMapping("/place/{name}")  
    public String place(@PathVariable("name")String name,
    		HttpServletRequest request,HttpServletResponse response) {
    	
    	response.setHeader("Access-Control-Allow-Origin", "*");
    	Place place=new Place(name);
		
        return place.getJson();
    }  
}  
