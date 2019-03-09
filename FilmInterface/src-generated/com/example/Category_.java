package com.example;

import com.example.Note;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipseLink - Thu Mar 07 08:18:24 CET 2019")
@StaticMetamodel(Category.class)
public class Category_ { 

	public static volatile ListAttribute<Category, Note> notes;
	public static volatile SingularAttribute<Category, String> name;
	public static volatile SingularAttribute<Category, Integer> id;

}