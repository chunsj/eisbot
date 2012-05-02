package eisbot.experiments;

import eisbot.abl.ABLStarCraftBot;
 
public class EISBot { 
 
	public static void main(String[] args) {
 
		System.setProperty("ABLBotName", "EISBotAAAI");   
//		System.setProperty("BuildOrderScript", "src/eisbot/buildorder/buildorders/PvP.txt");  
		System.setProperty("BuildOrderScript", "src/eisbot/buildorder/buildorders/Default.txt");   
 		 
		System.setProperty("GoalFormulator.Enable", "true");
		System.setProperty("GoalFormulator.PlanningWindowSize", "15");
		System.setProperty("OpponentPredictor.Enable", "true");
		System.setProperty("OpponentPredictor.PredictionWindowSize", "10");
		System.setProperty("GDA.Enable", "true");
		System.setProperty("GDA.DiscrepancyPeriod", "" + (24*30));
          
		// ICCup mode    
		System.setProperty("GameSettings.IccupMode", "true");
		System.setProperty("GameSettings.ShowGUI", "false"); 
		System.setProperty("GameSettings.UseManners", "true"); 
		System.setProperty("GameSettings.Fastest", "false"); 
		System.setProperty("GameSettings.UserInput", "false"); 
  
		ABLStarCraftBot.main(args);  
	}   
}
 