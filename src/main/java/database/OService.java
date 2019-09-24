/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

import ontology.description.OntologyDescription;

public class OService extends GenericService<OntologyDescription> {

    @Override
    public OntologyDescription find(Long id) {
        OntologyDescription result = super.find(id);
        return result;
    }

    @Override
    public OntologyDescription createOrUpdate(OntologyDescription entity) {
        session.save(entity, DEPTH_ENTITY);
        return null;
    }

    @Override
    public Class<OntologyDescription> getEntityType() {
        return OntologyDescription.class;
    }
}
