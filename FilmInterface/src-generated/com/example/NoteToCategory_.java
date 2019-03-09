package com.example;

import com.example.Category;
import com.example.Note;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated("EclipseLink - Thu Mar 07 08:18:24 CET 2019")
@StaticMetamodel(NoteToCategory.class)
public class NoteToCategory_ { 

	public static volatile SingularAttribute<NoteToCategory, Note> note;
	public static volatile SingularAttribute<NoteToCategory, Integer> id;
	public static volatile SingularAttribute<NoteToCategory, Category> category;

}