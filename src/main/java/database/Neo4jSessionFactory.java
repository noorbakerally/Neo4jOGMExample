/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

import org.neo4j.driver.v1.Config;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jSessionFactory {


    public final static String uri = "bolt://"+ DB.username+":"+DB.password+"@"+DB.DBServerName+":"+DB.DBServerPortBolt;


    private final static Configuration configuration = new Configuration.Builder()
            .uri(uri)
            .encryptionLevel(Config.EncryptionLevel.REQUIRED.name())
                .build();
    private final static SessionFactory sessionFactory = new SessionFactory(configuration,
                        "alignment","correspondenceprocessor","avatar","examples", "Main",
            "neo4j","ontology","raw2rdf",
            "similaritycalculation","utils","word");

    private static Neo4jSessionFactory factory = new Neo4jSessionFactory();


    public static Neo4jSessionFactory getInstance() {
        return factory;
    }

    // prevent external instantiation
    private Neo4jSessionFactory() {

    }


    public Session getNeo4jSession() {
        return sessionFactory.openSession();
    }

    public void closeNeo4jSession() {
        sessionFactory.close();
    }
}
