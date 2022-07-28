package com.fis.compoent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TextEdtr")
public class TextEditor {
	@Autowired // DI
	private SpellChecker sp;

	public void loadDocument(String document) {
		System.out.println("Text editor loading" + document);
//		SpellChecker sp= new SpellChecker();
		sp.checkSpellingMistakes(document);
	}

}
