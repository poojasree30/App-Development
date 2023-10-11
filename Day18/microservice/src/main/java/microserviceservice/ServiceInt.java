package microserviceservice;

import microservicemodel.Model;
import microservicerepository.RepoInt;


import java.util.List;

public interface ServiceInt extends RepoInt {
    public List<Model> getdatas();
    public List<Model> postdatas(Model m1);
}