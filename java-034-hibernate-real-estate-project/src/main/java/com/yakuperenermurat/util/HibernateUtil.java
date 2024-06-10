package com.yakuperenermurat.util;

import com.yakuperenermurat.model.Agent;
import com.yakuperenermurat.model.Buyer;
import com.yakuperenermurat.model.Property;
import com.yakuperenermurat.model.Seller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();

/*                // MYSQL 8
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost/companydb");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Yakup.8215");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
*/

                // PostgreSQL
                settings.put(Environment.DRIVER, "org.postgresql.Driver");
                settings.put(Environment.URL, "jdbc:postgresql://localhost/companydb");
                settings.put(Environment.USER, "postgres");
                settings.put(Environment.PASS, "yakup660");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");


                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.FORMAT_SQL, "false");

                settings.put(Environment.HBM2DDL_AUTO, "create");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Agent.class);
                configuration.addAnnotatedClass(Buyer.class);
                configuration.addAnnotatedClass(Seller.class);
                configuration.addAnnotatedClass(Property.class);


                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}