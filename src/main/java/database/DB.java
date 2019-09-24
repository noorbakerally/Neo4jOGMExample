/*Copyright (c) 2013-2019 LAAS-CNRS (www.laas.fr)  7 Colonel Roche 31077 Toulouse - France
and IRIT 118 route de Narbonne, Toulouse - France
The use of this source code requires an agreement with the LAAS-CNRS and IRIT.
Contributors: Mohammad Noorani Bakerally, Nathalie Hernandez, Thierry Monteil.*/
package database;

public class DB {
    public static OService oService;
    public static RDService rdService;
    public static String username = "neo4j";
    public static String password = "test";
    public static String DBServerName = "localhost";

    public static String DBServerPortBolt = "7687";
    public static String DBServerPortHTTP = "7474";
    public static String DBServerPortHTTPS = "7473";
    public static String DBServerPort = DBServerPortHTTP;

}
