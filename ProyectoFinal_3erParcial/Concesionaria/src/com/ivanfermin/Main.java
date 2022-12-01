package com.ivanfermin;

import com.ivanfermin.dao.ClienteDao;
import com.ivanfermin.dao.CocheDao;
import com.ivanfermin.dao.RevisionDao;
import com.ivanfermin.model.Cliente;
import com.ivanfermin.model.Coche;
import com.ivanfermin.model.Revision;
import com.ivanfermin.util.Conector;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main (String[] arg){
        Connection connection = Conector.getConnection();
        Cliente cliente = new Cliente("1450","Carlos Perez","Cochabamba","Av. Ayacucho s/n",4245213);
        Cliente laura = new Cliente("1451","Carlos Perez","Cochabamba","Av. Ayacucho s/n",4334567);
        Cliente roberto = new Cliente("1452","Roberto Claros","Cochabamba","Calle Junin s/n",4657676);
        Cliente lorena = new Cliente("1453","Lorena Peredo","Cochabamba","Av. Heroinas s/n",42452138);
        Cliente jose = new Cliente("1454","Jose Caceres","Cochabamba","Calle Sucre s/n",4247675);
        Cliente maria = new Cliente("1455","Maria Vargas","Cochabamba","Calle Bolivar s/n",4131234);
        Cliente luis = new Cliente("1456-1B","Luis Villarroel","Cochabamba","Av. Blanco Galindo s/n",4211115);
        Cliente carmen = new Cliente("1457","Carmen Canedo","Cochabamba","Av. Albina Patiño s/n",4789521);

        //CRUB tabla clientes
        ClienteDao clienteDao = new ClienteDao();
        //create
        /*
        clienteDao.addCliente(laura);
        clienteDao.addCliente(roberto);
        clienteDao.addCliente(lorena);
        clienteDao.addCliente(jose);
        clienteDao.addCliente(maria);
        clienteDao.addCliente(luis);
        clienteDao.addCliente(carmen);
        */
        /*
        //READ
        List<Cliente> clientes = clienteDao.getAllClientes();
        for (int i = 0 ; i<clientes.size();i++){
            Cliente cliente = clientes.get(i);
            System.out.println(cliente);
        }
        */
        /*
        Update
        Cliente cliente = new Cliente("1450","Fernando Torrico","La Paz","Av. 6 de Agosto s/n",4444444);
        Cliente cliente0 = new Cliente ("1457","Orlando Fernandez", "Oruro", "Av. Cochabamba","")
        clienteDao.updateCliente(cliente);
        clienteDao.updateCliente(cliente0)

         */
        //Delete
        //clienteDao.deleteCliente("1450");
        //clienteDao.deleteCliente("1456-1B");


        CocheDao cocheDao = new CocheDao();
        //Coche coche = new Coche("74LB52","Ford","2022","Azul",15000,laura);
        Coche coche0 = new Coche("74LB51","Toyosa", "2007","Rojo", 14000, laura);
        Coche coche1 = new Coche("94OD12","Mercedes-Benz","2016-B","Blanco",50000,roberto);
        Coche coche2 = new Coche("62LV62","Audi","2020","Verde",100000,jose);
        Coche coche3 = new Coche("48PR21","Renault","2022","Azul",16000,maria);
        Coche coche4 = new Coche("89MB91","Suzuki","2019","Celeste",19000,luis);
        Coche coche5 = new Coche("94ER12","Ferrari","2019","Amarillo",191000,carmen);
        Coche coche6 = new Coche("30CM12","BMW","2021","Negro",25000,cliente);
        Coche coche7 = new Coche("40LM98","Nissan","2022","Plomo",16000,lorena);

        //Aniadir coche
        /*
        cocheDao.addCoche (coche0);
        cocheDao.addCoche (coche);
        cocheDao.addCoche (coche1);
        cocheDao.addCoche (coche2);
        cocheDao.addCoche (coche3);
        cocheDao.addCoche (coche4);
        cocheDao.addCoche (coche5);
        cocheDao.addCoche (coche6);
        cocheDao.addCoche (coche7);
        */
        //Update
        Coche cocheNuevo = new Coche("94OD12","Lexus","2021","Negro",60000,luis) ;
        cocheDao.updateCoche(cocheNuevo);
        Coche cocheNuevo1 = new Coche("40LM98","Quantum","2021","Plomo fugaz",15500,carmen);
        cocheDao.updateCoche(cocheNuevo1);

        //Delete
        /*
        cocheDao.deleteCoche("74LB51");
        cocheDao.deleteCoche("94OD12");
        cocheDao.deleteCoche("62LV62");
        cocheDao.deleteCoche("48PR21");
        cocheDao.deleteCoche("89MB91");
        cocheDao.deleteCoche("94ER12");
        cocheDao.deleteCoche("30CM12");
        cocheDao.deleteCoche("40LM98");
        */

        //READ
        /*List<Coche> coches = cocheDao.getAllCoches();
        for (int i = 0 ; i<coches.size();i++) {
            Coche coche = coches.get(i);
            System.out.println(coche);
        }
        */

        Revision r1 = new Revision("98452","Purflux","2 delanteros","Vtech",coche1);
        Revision r2 = new Revision("46123","Coopers","2 traseros","Valvoline",coche3);
        Revision r3 = new Revision("89789","MecaFilter","2 delanteros","Shell",coche6);
        Revision r4 = new Revision("81122","Mahle","2 traseros","Brava",coche5);
        Revision r5 = new Revision("31216","Purflux","2 delanteros","Mobil",coche7);
        Revision r6 = new Revision("61564","Coopers","2 traseros","Pennzoil",coche2);
        RevisionDao revisionDao = new RevisionDao();
        /*
        Aniadir
        revisionDao.addRevision(r1);
        revisionDao.addRevision(r2);
        revisionDao.addRevision(r3);
        revisionDao.addRevision(r4);
        revisionDao.addRevision(r5);
        revisionDao.addRevision(r6);
         */

        /*
        //Delete
        revisionDao.deleteRevision("31216");
        revisionDao.deleteRevision("61564");
        revisionDao.deleteRevision("81122");
         */

        //Update
        Revision revisionNueva = new Revision("89789","Mahle","2 traseros","Brava",coche0);
        revisionDao.updateRevision(revisionNueva);
        Revision revisionNueva1 = new Revision("98452", "Filtro de aire","Pennzoil", "4 llantas", coche5);
        revisionDao.updateRevision(revisionNueva1);
        //READ
        /*
        List<Revision> revisiones = revisionDao.getAllRevisiones();
        for (int i = 0 ; i<revisiones.size();i++) {
            Revision revision = revisiones.get(i);
            System.out.println(revision);
        }

         */
    }
}
