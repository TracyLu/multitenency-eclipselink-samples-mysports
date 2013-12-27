package eclipselink.example.mysports.application.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-12-27T22:13:50.884+0800")
@StaticMetamodel(Division.class)
public class Division_ {
	public static volatile SingularAttribute<Division, Integer> id;
	public static volatile SingularAttribute<Division, Boolean> defaultDivision;
	public static volatile SingularAttribute<Division, String> name;
	public static volatile ListAttribute<Division, Team> teams;
	public static volatile SingularAttribute<Division, Long> version;
}
