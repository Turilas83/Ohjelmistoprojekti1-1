package controller;

import dao.SaveDAO;

public class Questions {
	
	public void checkBox(String str) {
		SaveDAO saveDAO = new SaveDAO();
		saveDAO.saveCheckBoxQuestion(str);		
	}
	
	// tallenna multiple choice
	public void multipleChoice(String str) {
		SaveDAO saveDAO = new SaveDAO();
		saveDAO.saveMultipleChoiceQuestion(str);
	}
	
	// Tallenna skaala 1-5
	public void scala(String str) {
		SaveDAO saveDAO = new SaveDAO();
		saveDAO.saveScaleQuestion(str);
	}
	
	// Tallenna tekstikysymys
	public void openText(String str) {
		SaveDAO saveDAO = new SaveDAO();
		saveDAO.saveTextQuestion(str);
	}
	
	
}
