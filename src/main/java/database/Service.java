/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

interface Service<T> {
    Iterable<T> findAll();
    T find(Long id);
    void delete(Long id);
    T createOrUpdate(T object);
}