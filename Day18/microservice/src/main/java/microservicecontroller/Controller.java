package microservicecontroller;

import microservicemodel.Model;
import microserviceservice.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    public class Controller{
        @Autowired
        MainService s1;
        @GetMapping("/hi")
        public String print()
        {
            return "HI";
        }
        @GetMapping("/getmicro")
        public List<Model> getDetail()
        {
            return s1.getDetail();
        }
        @PostMapping("/feedbackpost")
        public String postDetail(@RequestBody Model m1) {
            return s1.postDetail(m1);

        }

        }



