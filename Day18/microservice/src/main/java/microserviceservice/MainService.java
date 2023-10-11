package microserviceservice;

import microservicemodel.Model;
import microservicerepository.RepoInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
    public class MainService {
    @Autowired
    RepoInt r1;

    public List<Model> getDetail() {

        return r1.findAll();
    }
        public String postDetail(Model m1)
        {
            r1.save(m1);
            return "Training Details are saved";
        }
}


