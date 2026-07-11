package springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String root(Model model) {
    	model.addAttribute("name" , "Abhishek Ranjan");
    	model.addAttribute("id" , 1001);
    	
    	List<String> friends = new ArrayList<>();
    	friends.add("Ashish");
    	friends.add("Shantanu");
    	friends.add("ganpat");
    	
    	model.addAttribute("friends",friends );
    	
        return "index";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    
    @RequestMapping("/help")
    public ModelAndView help() {
    	ModelAndView modelAndView = new ModelAndView();
    	
    	modelAndView.addObject("name", "abhishek");
    	modelAndView.addObject("rollNumber", 11);
    	
    	modelAndView.setViewName("help");
    	return modelAndView;
    }
    
    @RequestMapping("/search")
    
    public String searchProduct(@RequestParam("searchText") String inputString) {

        System.out.println(inputString);

        return "product";
    }
}
