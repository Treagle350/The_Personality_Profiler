package Profile;

public class Personality {
	
	private int extravert_introvert;
	private int observing_intuitive;
	private int feeling_thinking;
	private int judging_prospecting;
	
	public Personality() {
		extravert_introvert = 0;
		observing_intuitive = 0;
		feeling_thinking = 0;
		judging_prospecting = 0;
	}
	
	public void updateEI(int amount) {
		extravert_introvert = extravert_introvert + amount;
	}
	public void updateSN(int amount) {
		observing_intuitive = observing_intuitive + amount;
	}
	public void updateFT(int amount) {
		feeling_thinking = feeling_thinking + amount;
	}
	public void updateJP(int amount) {
		judging_prospecting = judging_prospecting + amount;
	}
	public int getProfile() {
		return 0;
	}
}
