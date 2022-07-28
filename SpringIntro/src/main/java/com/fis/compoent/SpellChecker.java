package com.fis.compoent;

import org.springframework.stereotype.Component;

@Component("spellcheck")
public class SpellChecker {
	
	public void checkSpellingMistakes(String document){
		System.out.println("Spell checker executed for "+ document);
		
	}
}	
