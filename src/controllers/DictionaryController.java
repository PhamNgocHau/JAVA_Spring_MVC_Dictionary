package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
@Controller
public class DictionaryController {
private Map<String , String> dictionary = new HashMap<>();
    {
        dictionary.put("hello","Xin Chao");
        dictionary.put("Why","Tai Sao");
        dictionary.put("I Like You","Toi Thich Ban");
    }

    @RequestMapping("/home")
    public String search(){
        return "dictionary";
    }

    @RequestMapping("/searchWord")
    public String searchWord(@RequestParam String txtSearch , Model model){
        String en = txtSearch;
        String vi = dictionary.get(en);

        model.addAttribute("vi",vi);
        return "dictionary";
    }
}
