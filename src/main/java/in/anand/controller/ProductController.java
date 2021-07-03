package in.anand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.anand.beans.product;

@Controller
public class ProductController {
	
	@GetMapping("/loadForm")
	public String loadForm(Model model)
	{
		product product = new product();
		product.setProductId(1);
		product.setProductName("mouse");
		product.setProductCost(8000.00);
		
		model.addAttribute("product", product);
		
		
		
		return "index";
	}
	
	@PostMapping("savebtnSubmission")
	public String handleSaveBtnSubmission(product product,Model model)
	{
		System.out.println(product);
		
		model.addAttribute("msg", "successfully submitted");
		
		return "dashboard";
	}
}
