
package com.tutorial.romanconverter.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.romanconverter.dto.IntegerRequestDTO;
import com.tutorial.romanconverter.model.IntegerConverter;




@Controller
public class IntegerConverterController {
    private String getIntegerConverterPage(int num, Model model) {
    IntegerConverter integerConverter = new IntegerConverter(num);

        model.addAttribute("integerConverter", integerConverter);
        return "view-conversion-result-integer.html";
    }
    
    @GetMapping(value = "/integer-converter/{num}")
    public String romanConverterWithPathVariable(@PathVariable(value = "num") int num, Model model) {
        return getIntegerConverterPage(num, model);
    }

    @GetMapping(value = "/integer-converter")
    public String romanConverterWithReqParam(@RequestParam(value = "num") int num, Model model) {
        return getIntegerConverterPage(num, model);
    }
    
    @GetMapping(value = "/convert-integer")
    public String getRomanCoverterWithView(Model model) {
        var integerRequestDTO = new IntegerRequestDTO();
        model.addAttribute("integerRequestDTO", integerRequestDTO);
        return "form-integer-converter.html";
    }

    @PostMapping(value = "/convert-integer")
    public String postRomanConverterWithView(
        @ModelAttribute IntegerRequestDTO integerRequestDTO, Model model
    ) {
        int romanFromView = integerRequestDTO.getNumerik();
        return getIntegerConverterPage(romanFromView, model);
    }
}
