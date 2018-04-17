package idsfinal.org.idsproy;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

    @RestController
    @RequestMapping("/api")
    @CrossOrigin

public class ControladorRuta {

        //TODOS
        @Autowired RepositorioRuta repoRuta;

        @CrossOrigin
        @RequestMapping(value="/rutas",method=RequestMethod.GET,
                headers = {"Accept=application/json"})

        public ArrayList<Ruta> encontrar_todos() {

            return (ArrayList<Ruta>) repoRuta.findAll();
        }

        //UNO

        @CrossOrigin
        @RequestMapping(value="/rutas/{id}",method=RequestMethod.GET,
                headers={"Accept=application/json"})
        public Optional<Ruta> unos(@PathVariable String id){

            return repoRuta.findById(id);

        }


        //Guardar

        @CrossOrigin
        @RequestMapping(value="rutas/{id}/{destino}/{distancia}/{taprox}/{lat}/{lon}/{servicio}", method = RequestMethod.GET, headers = {"Accept=application/json"})
        public Estatus guardar(@PathVariable String id, @PathVariable String destino,@PathVariable String distancia,@PathVariable String taprox,@PathVariable String lat,@PathVariable String lon,@PathVariable String servicio) {

                repoRuta.save(new Ruta(id,destino,distancia,taprox,lat,lon,servicio));

             return new Estatus(true, "Guardado con éxito");

        }

        //Guardar
        @CrossOrigin
        @RequestMapping(value="/rutas", method=RequestMethod.POST,
                headers ={"Accept=application/json"})
        public Estatus guardarJSON(@RequestBody String json)throws Exception{

            ObjectMapper maper=new ObjectMapper();
            Ruta rutita=  maper.readValue(json, Ruta.class);

            repoRuta.save(rutita);
            return new Estatus(true, "Guardado con éxito");

        }



        /* //ACTUALIZAR
    @CrossOrigin
    @RequestMapping(value="rutas/{id}/{destino}/{cuerpo}", method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@PathVariable String id,@PathVariable String destino, @PathVariable String cuerpo) {
        repoRuta.save(new Ruta(id,destino,cuerpo));
        return new Estatus(true, "Actualizado con éxito");

    }*/
/*
    //borrar
    @CrossOrigin
    @RequestMapping(value="Ruta/{id}/", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public Estatus borrar(@PathVariable String id) {
        Estatus estatus = new Estatus(true,"Borrado con éxito");
        repoRuta.delete(new Ruta(id));

        return estatus;
    }
*/

    }
