package com.example;

import com.example.Note;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipseLink - Tue Mar 05 09:58:33 CET 2019")
@StaticMetamodel(Project.class)
public class Project_ { 

	public static volatile ListAttribute<Project, Note> notes;
	public static volatile SingularAttribute<Project, String> name;
	public static volatile SingularAttribute<Project, Integer> id;

}