//package com.flaginfo.wdy.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.flaginfo.wdy.api.user.domain.Country;
//import com.flaginfo.wdy.api.user.service.CountryService;
//import com.github.pagehelper.PageInfo;
//
///**
// * @author zhaocheng
// * @since 2017-2-20
// */
//@Controller
//@RequestMapping("/countries")
//public class CountryController {
//
//	@Autowired
//	private CountryService countryService;
//
//	@RequestMapping
//	public ModelAndView getAll(Country country) {
//		ModelAndView result = new ModelAndView("index");
//		// List<Country> countryList = countryService.findAll(country);
//		List<Country> countryList = countryService.findAll();
//		result.addObject("pageInfo", new PageInfo<Country>(countryList));
//		result.addObject("queryParam", country);
//		// result.addObject("page", country.getPage());
//		// result.addObject("rows", country.getRows());
//		return result;
//	}
//
//	@RequestMapping(value = "/add")
//	public ModelAndView add() {
//		ModelAndView result = new ModelAndView("view");
//		result.addObject("country", new Country());
//		return result;
//	}
//
//	// @RequestMapping(value = "/view/{id}")
//	// public ModelAndView view(@PathVariable Integer id) {
//	// ModelAndView result = new ModelAndView("view");
//	// Country country = countryService.getById(id);
//	// result.addObject("country", country);
//	// return result;
//	// }
//	//
//	// @RequestMapping(value = "/delete/{id}")
//	// public ModelAndView delete(@PathVariable Integer id, RedirectAttributes
//	// ra) {
//	// ModelAndView result = new ModelAndView("redirect:/countries");
//	// countryService.deleteById(id);
//	// ra.addFlashAttribute("msg", "删除成功!");
//	// return result;
//	// }
//
//	@RequestMapping(value = "/save", method = RequestMethod.POST)
//	public ModelAndView save(Country country) {
//		ModelAndView result = new ModelAndView("view");
//		String msg = country.getId() == null ? "新增成功!" : "更新成功!";
//		countryService.save(country);
//		result.addObject("country", country);
//		result.addObject("msg", msg);
//		return result;
//	}
//}
