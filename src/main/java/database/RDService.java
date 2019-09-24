/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

import ontology.description.ClassDescription;

public class RDService extends GenericService<ClassDescription> {

    @Override
    public ClassDescription createOrUpdate(ClassDescription entity) {
        session.save(entity, DEPTH_ENTITY);
        ClassDescription result = find(entity.id);
        //Neo4jSessionFactory.getInstance().closeNeo4jSession();
        return result;
    }

    public void createOrUpdate1(ClassDescription entity) {
        session.save(entity, -1);
    }



    @Override
    public Class<ClassDescription> getEntityType() {
        return ClassDescription.class;
    }
}
