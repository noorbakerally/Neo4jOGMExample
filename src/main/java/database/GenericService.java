/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

import org.neo4j.ogm.session.Session;

public abstract class GenericService<T> implements Service<T> {

    public static final int DEPTH_LIST = 2;
    public static final int DEPTH_ENTITY = 4;
    protected Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();


    public Iterable<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }


    public T find(Long id) {
        return session.load(getEntityType(), id, DEPTH_ENTITY);
    }


    public void delete(Long id) {
        session.delete(session.load(getEntityType(), id));
    }


    public abstract T createOrUpdate(T entity);
    public abstract Class<T> getEntityType();
    public void closeService(){
        Neo4jSessionFactory.getInstance().closeNeo4jSession();
    }

    public Session getSession(){
        return session;
    }
}