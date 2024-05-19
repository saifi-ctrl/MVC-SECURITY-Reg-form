package com.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.product.entity.User;
import com.product.service.UserService;
import com.product.util.CommonUtil;

@Controller
public class ProductController {
	@Autowired
	UserService userService;
@RequestMapping("/")
	public String loginPage(User user) {
		return "StartingPage";
		
	}
	
@RequestMapping("/loginUser")
public String loginDisplay(@ModelAttribute("users") User user) {

	return "LoginDetails";
}
	
	
	@RequestMapping("/add")
	public String display(@ModelAttribute("users") User user) {

		return "Register";
	}

	@PostMapping("/save")
	public String getRegister(@ModelAttribute("users") User user,  Model model) {

		System.out.println("hi");		
		userService.register(user);
		model.addAttribute("user", user);
		return "redirect:/getUserList";

	}

	@RequestMapping("/getmail")
	public String getEmail(@ModelAttribute("users") User user, @RequestParam("email") String email, Model model) {
		User userDetail = userService.getByEmail(email);
		model.addAttribute("user", userDetail);
		return "update";

	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String update(@ModelAttribute("users") User user, Model model) {
		userService.updateByUser(user);
		model.addAttribute("user", user);
		return "redirect:/getUserList";

	}

	@GetMapping("/delete")
	public String deleteByEmail(@RequestParam String email) {
		System.out.println("deleted");
		userService.deleteUser(email);

		return "redirect:/getUserList";

	}

	@GetMapping("/getUserList")
	public String listAll(User user, Model model) {
		List<User> listUser = userService.listUsers();
		model.addAttribute("listUser", listUser);
		return "UserList";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginC(@ModelAttribute("loginU") User user, Model model) {
		User detail = userService.loginUser(user.getEmail());
		
		String passwordUser = CommonUtil.Decryptpassword(detail.getPassWord());
		
		if (detail.getEmail().equals(user.getEmail()) && (passwordUser.equals(user.getPassWord()))) {
			model.addAttribute("user", detail);
			return "ProfilePage";

		} else

		{
			System.out.println("Invalid Credentials");
			return "loginDetails";

		}

	}
}
