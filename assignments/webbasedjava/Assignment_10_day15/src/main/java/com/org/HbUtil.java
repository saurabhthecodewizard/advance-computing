package com.org;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HbUtil {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	private static StandardServiceRegistry serviceRegistry;
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			
			serviceRegistry = new StandardServiceRegistryBuilder()
					.configure()
					.build();
			
			Metadata metadata = new MetadataSources(serviceRegistry)
					.getMetadataBuilder()
					.build();
			
			return metadata.buildSessionFactory();

			

			
//				Configuration cfg = new Configuration()
//				cfg.configure();
//				return cfg.buildSessionFactory();

			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		sessionFactory.close();
	}

}
