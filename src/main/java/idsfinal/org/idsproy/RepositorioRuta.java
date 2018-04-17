package idsfinal.org.idsproy;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.io.Serializable;

    public interface RepositorioRuta extends MongoRepository<Ruta, String> {

}
   