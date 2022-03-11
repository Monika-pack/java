package spell_checker;

public class TextEditor {
	SpellChecker sp;
	public TextEditor(SpellChecker sp){ //Job of the spring from XML file
	   System.out.println("Inside texteditor constructor");
	    this.sp=sp;   //Injecting
	}
	public void TextspellCheck(){
	   sp.spellCheck();
	}
	

public void callSpellCheck() {
	
	
}


}
