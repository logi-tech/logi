package cc.logitech.logi.controller.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/post")
    public String showAddArticle(){
        return "/community/post";
    }


}
