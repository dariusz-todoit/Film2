package com.example;

import com.example.Category;
import com.example.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipseLink - Thu Mar 07 08:18:24 CET 2019")
@StaticMetamodel(Note.class)
public class Note_ { 

	public static volatile SingularAttribute<Note, String> note;
	public static volatile SingularAttribute<Note, Project> project;
	public static volatile SingularAttribute<Note, Integer> noteId;
	public static volatile ListAttribute<Note, Category> categories;
	public static volatile SingularAttribute<Note, Integer> projectID;

}