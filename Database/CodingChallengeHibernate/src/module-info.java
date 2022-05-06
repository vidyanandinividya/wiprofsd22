module CodingChallengeHibernate {
	requires java.sql;
	requires net.bytebuddy;
	requires java.persistence;
	requires org.hibernate.orm.core;
	requires com.sun.xml.bind;
	requires com.fasterxml.classmate;
	opens entity;
}