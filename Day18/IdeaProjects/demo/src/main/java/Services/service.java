package Services;

import Repository.RepoInt;
import model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {
    @Autowired
    RepoInt r1;

    public List<Model> getDetail()
    {
        return r1.findAll();
    }

}

